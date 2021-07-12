//DAVID RIVERA ARTERO

//LO QUE HACE NUESTRO PROGRAMA ES PREGUNTARNOS LA LONGITUD DE LA LISTA, LUEGO SE ESCOGERAN NUMEROS ALEATORIOS Y POR ULTIMO SE SUMARAN
import javax.swing.JOptionPane;

public class UD6_Ej9_App {

	public static void main(String[] args) {
		String num = JOptionPane.showInputDialog("DAME LA LONGITUD QUE TENDRA LA LISTA");
		Integer longitud = Integer.parseInt(num);
		
		//CREAMOS LA LISTA
		int dicc[] = new int [longitud];
		int[] resultado = aleatorio(dicc);
		
		
		int resultadoS = suma(dicc);
		JOptionPane.showInternalMessageDialog(null,"LA SUMA DE TODOS LOS VALORES ES: " + resultadoS );
	}
	
	public static int[] aleatorio(int[] dicc) {
		int num1 = 0;
		int num2 = 9;
		//NUMEROS ALEATORIOS Y SE AÑADEN A LA LISTA
		for (int i = 0; i<dicc.length; i++) {
			int num = (int)Math.floor(Math.random()*(num1-(num2+1))+(num2));
			dicc[i]=num;
			JOptionPane.showInternalMessageDialog(null,"LOS VALORES DE LA LISTA SON: " + dicc[i] );
			
		}
		return dicc;
		
	}
	
	public static int suma(int[] dicc) {
		int suma = 0;
		//SE SUMA LOS VALORES 
		for (int i = 0; i<dicc.length; i++) {
			suma = suma + dicc[i];
		}
		return suma;
		
		
	} 

}
