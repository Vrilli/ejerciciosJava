package pesetas;

import java.util.Scanner;

public class convertirpesetasEuros {

		 public static void convertir(double valorEuro, String pais) {
		        Scanner leer = new Scanner(System.in);
		        System.out.printf("Ingrese la cantidad de Pesetas en %s: ", pais);
		        double cantidadMoneda = leer.nextDouble();

	
		        double euros = cantidadMoneda / valorEuro;

		      
		        euros = Math.round(euros * 100.0) / 100.0;

		        System.out.println("Tienes " + euros + " Euros");

		        leer.close();
		    }
		 public static void main(String[] args) {
				convertir(166.386, "España"); 
					
				}
}
