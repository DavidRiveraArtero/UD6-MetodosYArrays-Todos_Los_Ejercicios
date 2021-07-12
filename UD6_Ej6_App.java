//DAVID RIVERA ARTERO

//ESTE PROGRAMA LO QUE HACE ES CONTAR EL NUMERO DE CIFRAS 
import javax.swing.JOptionPane;
public class UD6_Ej6_App {

	public static void main(String[] args) {
		String num = JOptionPane.showInputDialog("DAME NUMEROS");
		Integer nums = Integer.parseInt(num);
		//MIRAMOS QUE EL VALOR QUE NOS INTRODUCEN ES POSITIVO O NO 
		if (nums < 0) {
			JOptionPane.showInternalMessageDialog(null, "NECESITO NUMEROS POSITIVOS");
			
		}else {
			Integer resultado = operacion(nums);
			JOptionPane.showInternalMessageDialog(null, "EL resultado es: " + resultado);
		}
		
	}
	
	public static Integer operacion (int nums) {
		int digitos =0;
		while (nums != 0) {
			nums = nums/10;
			digitos++;
		}
		
		return digitos;
		
	}
	

}
