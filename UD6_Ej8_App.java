//DAVID RIVERA ARTERO

//LO QUE HACE ESTE PROGRAMA ES AÑADIR CONTENIDO A UNA LISTA Y LUEGO MOSTRARLO
import javax.swing.JOptionPane;

public class UD6_Ej8_App {

	public static void main(String[] args) {
		
		boolean salir = false;
		
		int dicc[] = new int [10];
		while (salir == false) {
			String opcion = JOptionPane.showInputDialog("QUE QUIERES HACER AÑADIR CONTENIDO O MOSTRAR CONTENIDO: ");
			//DEPENDIENDO DE LA OPCION ENTRARA EN UN METODO O OTRO
			switch (opcion) {
				case ("mostrar"):
					int[] resultado = mostrar(dicc);
					salir = true;
					break;
				case ("añadir"):
					int[] resultadoA = añadir(dicc);
					break;
		
			}
			
		}
		
	}
	public static int[] mostrar(int[] dicc) {
		for (int i = 0; i<dicc.length; i++) {
			System.out.println(dicc[i]);
		}
		
		return dicc;
		
	}
	
	public static int[] añadir(int[] dicc) {
		int cont = 0;
		while (cont < 10) {
			String nums = JOptionPane.showInputDialog("DAME LOS NUMEROS: ");
			Integer num = Integer.parseInt(nums);
			dicc[cont]=num;
			cont++;
		}
		return dicc;
		
	}
	
}
