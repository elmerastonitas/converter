package model;

public class MassConversion extends Conversion {
    public MassConversion(String unidadInicial, String unidadFinal) {
        super(unidadInicial, unidadFinal);
    }

    @Override
    public double convertir(double valor) {
        switch (unidadInicial) {
            case "Gramos":
                switch (unidadFinal) {
                    case "Kilogramos":
                        return valor / 1000;
                    case "Onzas":
                        return valor * 0.035274;
                    case "Libras":
                        return valor * 0.002205;
                    default:
                        return valor; // Unidades iguales, no se hace conversión
                }
            case "Kilogramos":
                switch (unidadFinal) {
                    case "Gramos":
                        return valor * 1000;
                    case "Onzas":
                        return valor * 35.274;
                    case "Libras":
                        return valor * 2.205;
                    default:
                        return valor; // Unidades iguales, no se hace conversión
                }
            case "Onzas":
                switch (unidadFinal) {
                    case "Gramos":
                        return valor / 0.035274;
                    case "Kilogramos":
                        return valor / 35.274;
                    case "Libras":
                        return valor / 16;
                    default:
                        return valor; // Unidades iguales, no se hace conversión
                }
            case "Libras":
                switch (unidadFinal) {
                    case "Gramos":
                        return valor / 0.002205;
                    case "Kilogramos":
                        return valor / 2.205;
                    case "Onzas":
                        return valor * 16;
                    default:
                        return valor; // Unidades iguales, no se hace conversión
                }
            default:
                return valor; // Unidad inicial no reconocida, no se hace conversión
        }
    }
}

               
