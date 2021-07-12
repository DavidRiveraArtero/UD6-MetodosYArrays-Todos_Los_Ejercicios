//DAVID RIVERA ARTERO

//PROGRAMA QUE TE CALCULA EL FACTORIAL DE UN NUMERO QUE ES MULTIPLICAR EL NUMERO QUE PONES CON SUS ANTERIORES EJ SI ES 5 SERIA : 5*4*3*2*1 
import javax.swing.JOptionPane;
public class UD6_Ej4_App {

	public static void main(String[] args) {
		//LE PEDIMOS AL USUARIO QUE INTRODUZCA UN NUMERO PARA PODER HACER EL FACTORIAL
		String num = JOptionPane.showInputDialog("DAME UN NUMERO PARA PODER HACER EL FACTORIAL");
		Integer numFactorial = Integer.parseInt(num);
		
		//LAMAMOS A LA FUNCION PARA HACER EL CALCULO
		Integer resultado = factorial(numFactorial);
		
		System.out.print(resultado);

	}
	
	public static Integer factorial (int numFactorial) {
		int operacion = 1;
		while (numFactorial != 0) {
			operacion = operacion * numFactorial;
			numFactorial--;
		}
		
		return operacion;
	}
	

}
