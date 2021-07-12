//DAVID RIVERA ARTERO

//LO QUE HACE EL PROGRA ES PEDIRNOS UNA CANTIDAD DE EUROS Y NOSOTROS LE TENDREMOS QUE DECIR A QUE MONEDA QUEREMOS CAMBIAR 

import javax.swing.JOptionPane;
public class UD6_Ej7_App {

	public static void main(String[] args) {
		
		String mon = JOptionPane.showInputDialog("A QUE MONEDO LO QUIERES PASSAR");
		//DEPENDIENDO DE LA OPCION ENTRARA EN UN METODO O OTRO
		switch (mon) {
			case "libras":
				double resultadoL = libras(mon);
				JOptionPane.showInternalMessageDialog(null," El resultado es: " + resultadoL);
				break;
		
			case "dolar":
				double resultadoD = dolar(mon);
				JOptionPane.showInternalMessageDialog(null," El resultado es: " + resultadoD);
				break;
				
			case "yenes":
				double resultadoY = dolar(mon);
				JOptionPane.showInternalMessageDialog(null," El resultado es: " + resultadoY);
				break;
				
		}
			

	}
	
	public static double libras (String mon) {
		String nums = JOptionPane.showInputDialog("CANTIDAD DE EUROS");
		Integer moneda = Integer.parseInt(nums);
		double opera = (moneda * 0.86);
		return opera;		
	}
	
	public static double dolar (String mon) {
		String nums = JOptionPane.showInputDialog("CANTIDAD DE EUROS");
		Integer moneda = Integer.parseInt(nums);
		double opera = (moneda * 1.2);
		return opera;
		
		
	}
	
	public static double yenes (String mon) {
		String nums = JOptionPane.showInputDialog("CANTIDAD DE EUROS");
		Integer moneda = Integer.parseInt(nums);
		
		double opera = (moneda * 130);
		return opera;
		
		
	}

}
