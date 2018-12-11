/**
 * @author Jorge Bedmar
 *
 */
package Calculo_de_areas;
import java.util.Scanner;

public class CalculoAreas {
	//
	Scanner sc = new Scanner (System.in);
	
	private int opcion = 1;

	private double base   = 0.0;
	private double altura = 0.0;
	private double base2  = 0.0;
	
	private double area   = 0.0;
	
	
	public void menu(){
		
		System.out.println (" \t\t C�lculo de �reas\n________________________________\n ");
		System.out.println ("1. Calcular el �rea de un tri�ngulo\n2. Calcular el �rea de un trapecio");
		System.out.println ("3. Calcular el �rea de un rect�ngulo\n4. Salir\n\n Introduzca su opcion: ");
		
		String cadena = sc.next();
		opcion = Integer.parseInt(cadena);
		
		while(opcion == 1 || opcion == 2 || opcion == 3) {
			
			if(opcion == 1) {
				
				System.out.println("\n Introduzca la base y la altura del tri�ngulo para calcular su area");
				if(sc.hasNextDouble()) {
					base = sc.nextDouble();
					if(sc.hasNextDouble()) {
						altura = sc.nextDouble();
					}
				}
				area = areaTriangulo(base, altura);
				
				if(area != 0.0) {
					System.out.printf("\n El �rea del tri�ngulo es %.2f", area);
				}else {
					System.out.println("\n No se puede calcular el �rea del tri�ngulo debido a datos de entrada err�neos");
				}
				
			}
			
		}
		
	}
	
	public double areaTriangulo(double b, double a) {
		
		if(b > 0 && a > 0) {
			return b*a/2.0;
		}
		return 0.0;
	}

}