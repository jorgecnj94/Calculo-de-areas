/**
 * @author Jorge Bedmar
 *
 */
package Calculo_de_areas;
import java.util.Scanner;

public class CalculoAreas {
	//
	
	
	public static void menu(){
		Scanner sc = new Scanner (System.in);
		
		int opcion = 1;

		double base   = 0.0;
		double altura = 0.0;
		double base2  = 0.0;
		
		double area   = 0.0;
		
		System.out.println (" \t\t Cálculo de áreas\n________________________________\n ");
		System.out.println ("1. Calcular el área de un triángulo\n2. Calcular el área de un trapecio");
		System.out.println ("3. Calcular el área de un rectángulo\n4. Salir\n\n Introduzca su opcion: ");
		
		String cadena = sc.next();
		opcion = Integer.parseInt(cadena);
		
		while(opcion == 1 || opcion == 2 || opcion == 3) {
			
			if(opcion == 1) {
				
				System.out.println("\n Introduzca la base y la altura del triángulo para calcular su area");
				if(sc.hasNextDouble()) {
					base = sc.nextDouble();
					if(sc.hasNextDouble()) {
						altura = sc.nextDouble();
					}
				}
				area = areaTriangulo(base, altura);
				
				if(area != 0.0) {
					System.out.printf("\n El área del triángulo es %.2f", area);
				}else {
					System.out.println("\n No se puede calcular el área del triángulo debido a datos de entrada erróneos");
				}
				
			}

			if(opcion == 2) {

				System.out.println("\n Introduzca los dos lados y la altura del trapecio para calcular su area");

				if(sc.hasNextDouble()) {
					base = sc.nextDouble();
					if(sc.hasNextDouble()) {
						base2 = sc.nextDouble();
						if(sc.hasNextDouble()) {
							altura = sc.nextDouble();
						}
					}
				}
				
				area = areaTrapecio(base, base2, altura);
				if(area != 0.0) {
					System.out.printf("\n El área del trapecio es %.2f", area);
				}else {
					System.out.println("\n No se puede calcular el área del trapecio debido a datos de entrada erróneos");
				}
			}
			if(opcion == 3) {
				
				System.out.println("\n Introduzca la base y la altura del rectángulo para calcular su area");
				
				if(sc.hasNextDouble()) {
					base = sc.nextDouble();
					if(sc.hasNextDouble()) {
						altura = sc.nextDouble();
					}
				}
				area = areaRectangulo(base, altura);
				if(area != 0.0) {
					System.out.printf("\n El área del rectángulo es %.2f", area);
				}else {
					System.out.println("\n No se puede calcular el área del rectángulo debido a datos de entrada erróneos");
				}
			}
			
			opcion = Integer.parseInt(cadena);
		}
		
	}
	
	public static double areaTriangulo(double b, double a) {
		
		if(b > 0 && a > 0) {
			return b*a/2.0;
		}
		return 0.0;
	}

	public static double areaTrapecio(double b, double b2, double a) {

		if(b > b2  || b < b2) {
			return a*((b+b2)/2.0);
		}
		return 0.0;
	}
	public static double areaRectangulo(double b, double a) {

		if(b >= 2 && b <= 10 && a >= 2 && a <= 10) {
			return b*a;
		}
		return 0.0;
	}

}
