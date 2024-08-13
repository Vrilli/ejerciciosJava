package factura;

public class factura {

	public static void main(String[] args) {
	
        double baseImponible = 100.0; 
        double iva = 21.0; 
        double totalFactura = baseImponible + (baseImponible * iva / 100);

      
        System.out.println("Base Imponible: " + baseImponible);
        System.out.println("IVA: " + iva + "%");
        System.out.println("Total de la factura: " + totalFactura);

	}

}
