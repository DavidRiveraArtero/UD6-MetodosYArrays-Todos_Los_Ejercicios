//DAVID RIVERA ARTERO

//EL PROGRAMA LO QUE HACE ES PEDIRNOS UN NUMERO Y ESTE NOS DICE SI ES PRIMO O NO
import javax.swing.JOptionPane;
public class UD6_Ej3_App {

	public static void main(String[] args) {
		//LE PEDIMOS UN NUMERO AL USUARIO
		String num = JOptionPane.showInputDialog("DAME UN NUMERO PARA SABER SI ES PRIMO: ");
		//LO PASAMOS A INTEGER
		Integer primo = Integer.parseInt(num);
		//LLAMAMOS AL METODO PRIMO PARA PODER SABER SI LO ES
		boolean resultado = primo (primo);
		//SI RESULTADO ES TRUE SIGNIFICA QUE EL NUMERO ES PRIMO
		if (resultado) {
			JOptionPane.showInternalMessageDialog(null, "EL NUMERO ES PRIMO");
		//SI RESULTADO ES FALSE SIGNIFICA QUE EL NUMERO NO ES PRIMO
		}else {
			JOptionPane.showInternalMessageDialog(null, "EL NUMERO NO ES PRIMO");
		}

	}
	
	public static boolean primo (int primo) {
		boolean resultado = true; 
	    for(int i = 2; i < primo; i++) {
	        if (primo % i == 0) {
	            resultado = false;
	            break;
	        }
	    }
		return resultado;
		
	}
	
	

}
