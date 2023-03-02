package model;

public class TemperatureConversion extends Conversion {
    public TemperatureConversion(String unidadInicial, String unidadFinal) {
        super(unidadInicial, unidadFinal);
    }

    @Override
    public double convertir(double valor) {
        switch (unidadInicial) {
            case "Celsius":
                switch (unidadFinal) {
                    case "Fahrenheit":
                        return (valor * 9/5) + 32;
                    case "Kelvin":
                        return valor + 273.15;
                    default:
                        return valor; // Unidades iguales, no se hace conversión
                }
            case "Fahrenheit":
                switch (unidadFinal) {
                    case "Celsius":
                        return (valor - 32) * 5/9;
                    case "Kelvin":
                        return (valor + 459.67) * 5/9;
                    default:
                        return valor; // Unidades iguales, no se hace conversión
                }
            case "Kelvin":
                switch (unidadFinal) {
                    case "Celsius":
                        return valor - 273.15;
                    case "Fahrenheit":
                        return valor * 9/5 - 459.67;
                    default:
                        return valor; // Unidades iguales, no se hace conversión
                }
            default:
                return valor; // Unidad inicial no reconocida, no se hace conversión
        }
    }
}
