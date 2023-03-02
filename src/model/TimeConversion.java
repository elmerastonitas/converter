package model;

public class TimeConversion extends Conversion {
    public TimeConversion(String unidadInicial, String unidadFinal) {
        super(unidadInicial, unidadFinal);
    }

    @Override
    public double convertir(double valor) {
        switch (unidadInicial) {
            case "Segundos":
                switch (unidadFinal) {
                    case "Minutos":
                        return valor / 60;
                    case "Horas":
                        return valor / 3600;
                    case "Días":
                        return valor / 86400;
                    default:
                        return valor; // Unidades iguales, no se hace conversión
                }
            case "Minutos":
                switch (unidadFinal) {
                    case "Segundos":
                        return valor * 60;
                    case "Horas":
                        return valor / 60;
                    case "Días":
                        return valor / 1440;
                    default:
                        return valor; // Unidades iguales, no se hace conversión
                }
            case "Horas":
                switch (unidadFinal) {
                    case "Segundos":
                        return valor * 3600;
                    case "Minutos":
                        return valor * 60;
                    case "Días":
                        return valor / 24;
                    default:
                        return valor; // Unidades iguales, no se hace conversión
                }
            case "Días":
                switch (unidadFinal) {
                    case "Segundos":
                        return valor * 86400;
                    case "Minutos":
                        return valor * 1440;
                    case "Horas":
                        return valor * 24;
                    default:
                        return valor; // Unidades iguales, no se hace conversión
                }
            default:
                return valor; // Unidad inicial no reconocida, no se hace conversión
        }
    }
}
