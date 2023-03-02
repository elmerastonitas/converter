package model;

public class LengthConversion extends Conversion {
	public LengthConversion(String unidadInicial, String unidadFinal) {
		super(unidadInicial, unidadFinal);
	}

	@Override
	public double convertir(double valor) {
		switch (unidadInicial) {
		case "Metros":
			switch (unidadFinal) {
			case "Kilómetros":
				return valor / 1000;
			case "Pulgadas":
				return valor * 39.37;
			case "Pies":
				return valor * 3.281;
			default:
				return valor; // Unidades iguales, no se hace conversión
			}
		case "Kilómetros":
			switch (unidadFinal) {
			case "Metros":
				return valor * 1000;
			case "Pulgadas":
				return valor * 39370.079;
			case "Pies":
				return valor * 3280.84;
			default:
				return valor; // Unidades iguales, no se hace conversión
			}
		case "Pulgadas":
			switch (unidadFinal) {
			case "Metros":
				return valor / 39.37;
			case "Kilómetros":
				return valor / 39370.079;
			case "Pies":
				return valor / 12;
			default:
				return valor; // Unidades iguales, no se hace conversión
			}
		case "Pies":
			switch (unidadFinal) {
			case "Metros":
				return valor / 3.281;
			case "Kilómetros":
				return valor / 3280.84;
			case "Pulgadas":
				return valor * 12;
			default:
				return valor; // Unidades iguales, no se hace conversión
			}
		default:
			return valor; // Unidad inicial no reconocida, no se hace conversión
		}
	}
}
