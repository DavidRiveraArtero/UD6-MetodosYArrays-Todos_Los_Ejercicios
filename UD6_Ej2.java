//DAVID RIVERA ARTERO

//EL PROGRAMA HACE IMPRIMIR UNA CANTIDAD DE NUMEROS ALEATORIOS QUE NOSOTROS LE PASEMOS

import javax.swing.JOptionPane;
public class UD6_Ej2 {

	public static void main(String[] args) {
		
		//LE PEDIMOS AL USUARIO QUE NOS INTRODUZCA NUMEROS PARA LUEGO PODER USARLOS PARA HACER LOS NUMEROS RANDOMS
		String opc1 = JOptionPane.showInputDialog("DAME El primer numero: ");
		String opc2 = JOptionPane.showInputDialog("DAME El segundo numero: ");
		//LOS PASAMOS A INTEGER PARA PODER USARLOS
		int num1 = Integer.parseInt(opc1);
		int num2 = Integer.parseInt(opc2);
		
		//POR CADA INTERACCION DEL DICCIONARIO PRINTAMOS SU CONTENIDO  
		for (int i = 1; i < num2; i++) {
			//LLAMAMOS AL METODO PARA QUE NOS DE NUMEROS ALEATORIOS 
			int aleat = aleatorio(num1,num2);
			JOptionPane.showMessageDialog(null, aleat);
		}
		
		
	}
	
	public static Integer aleatorio (int  num1, int num2) {
		int random = (int)Math.floor(Math.random()*(num1-(num2+1))+(num2));
		return random; 
	}
}
