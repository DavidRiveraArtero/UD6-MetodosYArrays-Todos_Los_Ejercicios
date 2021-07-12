//DAVID RIVERA ARTERO

//ESTE PROGRAMA LO QUE HACE ES PASSAR UN NUMERO DE DECIMAL A BINARIO
import javax.swing.JOptionPane;
public class UD6_Ej5_App {

	public static void main(String[] args) {
		//LE PEDIMOS AL USUARIO QUE INGRESE UN NUMERO
		String num = JOptionPane.showInputDialog("DAME UN NUMERO PARA PASARLO A DECIMAL");
		Integer deci = Integer.parseInt(num);
		
		String resultado = binario(deci);
		
		System.out.print(resultado);
		
		
	}

	public static String binario (int deci) {
		
		double binario2 = 0;
		int digito, exp;
		exp = 0;
		
		while (deci != 0) {
			digito = deci % 2;
			binario2 = binario2 + digito * Math.pow(10, exp);
			exp++;
			deci = deci/2;
		}
		String binario = ("Binario: "+ binario2);
		return binario;
		
		
		
		
	}
}
