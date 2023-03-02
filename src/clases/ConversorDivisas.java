package clases;

import java.util.Scanner;
public class ConversorDivisas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double tasaDolar = 3.4; // Tasa de cambio actualizada
		double tasaEuro = 3.8; // Tasa de cambio actualizada
		double tasaLibra = 4.5; // Tasa de cambio actualizada
		double tasaYen = 0.03; // Tasa de cambio actualizada
		double tasaWon = 0.003; // Tasa de cambio actualizada

		// Menú de opciones
		System.out.println("Seleccione una opción:");
		System.out.println("1. Convertir de Nuevos Sol a Dólar");
		System.out.println("2. Convertir de Nuevos Sol a Euros");
		System.out.println("3. Convertir de Nuevos Sol a Libras Esterlinas");
		System.out.println("4. Convertir de Nuevos Sol a Yen Japonés");
		System.out.println("5. Convertir de Nuevos Sol a Won sul-coreano");
		System.out.println("6. Convertir de Dólar a Nuevos Sol");
		System.out.println("7. Convertir de Euros a Nuevos Sol");
		System.out.println("8. Convertir de Libras Esterlinas a Nuevos Sol");
		System.out.println("9. Convertir de Yen Japonés a Nuevos Sol");
		System.out.println("10. Convertir de Won sul-coreano a Nuevos Sol");

		int opcion = sc.nextInt();
		double cantidad;

		switch (opcion) {
		case 1: // Convertir de Nuevos Sol a Dólar
			System.out.println("Ingrese la cantidad de Nuevos Sol a convertir:");
			cantidad = sc.nextDouble();
			System.out.println(cantidad + " Nuevos Soles equivalen a " + (cantidad / tasaDolar) + " Dólares");
			break;
		case 2: // Convertir de Nuevos Sol a Euros
			System.out.println("Ingrese la cantidad de Nuevos Sol a convertir:");
			cantidad = sc.nextDouble();
			System.out.println(cantidad + " Nuevos Soles equivalen a " + (cantidad / tasaEuro) + " Euros");
			break;
		case 3: // Convertir de Nuevos Sol a Libras Esterlinas
			System.out.println("Ingrese la cantidad de Nuevos Sol a convertir:");
			cantidad = sc.nextDouble();
			System.out.println(cantidad + " Nuevos Soles equivalen a " + (cantidad / tasaLibra) + " Libras Esterlinas");
			break;
		case 4: // Convertir de Nuevos Sol a Yen Japonés
			System.out.println("Ingrese la cantidad de Nuevos Sol a convertir:");
			cantidad = sc.nextDouble();
			System.out.println(cantidad + " Nuevos Soles equivalen a " + (cantidad / tasaYen) + " Yenes Japoneses");
			break;
		case 5: // Convertir de Nuevos Sol a Won sul-coreano
			System.out.println("Ingrese la cantidad de Nuevos Sol a convertir:");
			cantidad = sc.nextDouble();
			System.out.println(cantidad + " Nuevos Soles equivalen a " + (cantidad / tasaWon) + " Wones sul-coreanos");
			break;
		case 6: // Convertir de Dólar a Nuevos Sol
			System.out.println("Ingrese la cantidad de Dólares a convertir:");
			cantidad = sc.nextDouble();
			System.out.println(cantidad + " Dólares equivalen a " + (cantidad * tasaDolar) + " Nuevos Soles");
			break;
		case 7: // Convertir de Euros a Nuevos Sol
			System.out.println("Ingrese la cantidad de Euros a convertir:");
			cantidad = sc.nextDouble();
			System.out.println(cantidad + " Euros equivalen a " + (cantidad * tasaEuro) + " Nuevos Soles");
			break;
		case 8: // Convertir de Libras Esterlinas a Nuevos Sol
			System.out.println("Ingrese la cantidad de Libras Esterlinas a convertir:");
			cantidad = sc.nextDouble();
			System.out.println(cantidad + " Libras Esterlinas equivalen a " + (cantidad * tasaLibra) + " Nuevos Soles");
			break;
		case 9: // Convertir de Yen Japonés a Nuevos Sol
			System.out.println("Ingrese la cantidad de Yenes Japoneses a convertir:");
			cantidad = sc.nextDouble();
			System.out.println(cantidad + " Yenes Japoneses equivalen a " + (cantidad * tasaYen) + " Nuevos Soles");
			break;
		case 10: // Convertir de Won sul-coreano a Nuevos Sol
			System.out.println("Ingrese la cantidad de Wones sul-coreanos a convertir:");
			cantidad = sc.nextDouble();
			System.out.println(cantidad + " Wones sul-coreanos equivalen a " + (cantidad * tasaWon) + " Nuevos Soles");
			break;
		default: // Opción inválida
			System.out.println("Opción inválida");
		}

		sc.close();
	}
}
