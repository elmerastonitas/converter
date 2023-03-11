package model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

public class CurrencyConversion extends Conversion {
    private static final String API_KEY = "a774dcc2be74fa55fac82184"; // API key para obtener las tasas de conversión
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/a774dcc2be74fa55fac82184/latest/USD"; // URL de la API para obtener las tasas

    public CurrencyConversion(String unidadInicial, String unidadFinal) {
        super(unidadInicial, unidadFinal);
    }

    @Override
    public double convertir(double valor) {
        double tasaInicial = obtenerTasa(unidadInicial);
        double tasaFinal = obtenerTasa(unidadFinal);
        double valorEnUSD = valor / tasaInicial;
        return valorEnUSD * tasaFinal;
    }

    private double obtenerTasa(String unidad) {
        if (unidad.equals("Dólares (USD)")) {
            return 1; // Si la unidad es dólares, la tasa es 1 (no es necesario hacer la petición a la API)
        }
        try {
            URL url = new URL(API_URL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder result = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                result.append(line);
            }
            reader.close();
            
            JSONObject jsonObject = new JSONObject(result.toString());
            return jsonObject.getJSONObject("rates").getDouble(unidad);
        } catch (IOException e) {
            System.err.println("Error al obtener la tasa de conversión: " + e.getMessage());
            return 0;
        }
    }
}
