package model;

public class CurrencyConversion extends Conversion {
    private double tasaCambio;

    public CurrencyConversion(String unidadInicial, String unidadFinal, double tasaCambio) {
        super(unidadInicial, unidadFinal);
        this.tasaCambio = tasaCambio;
    }

    @Override
    public double convertir(double valor) {
        return valor * tasaCambio;
    }
}
