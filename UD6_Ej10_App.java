//DAVID RIVERA ARTERO

//LO QUE HACE NUESTRO PROGRAMA ES PEDIR LA LONGITUD DE LA LISTA Y LUEGO LE A�ADE NUMEROS RANDOMS PERO SOLO LOS QUE SON PRIMOS
import javax.swing.JOptionPane;

public class UD6_Ej10_App {

	public static void main(String[] args) {
		String num = JOptionPane.showInputDialog("DAME EL TAMA�O DE LA LISTA");
		int tama�o = Integer.parseInt(num);

		int dicc[] = new int[tama�o];
		int[] resultadoS = aleatorio(dicc);

	}
			
	public static int[] aleatorio(int[] dicc) {
		int num1 = 0;
		int num2 = 100;

		for (int i = 0; i < dicc.length; i++) {
			int num = (int) Math.floor(Math.random() * (num1 - (num2 + 1)) + (num2));
			int a = 2;
			boolean primo = true;
			while (a < num && primo) {
				if (num % a == 0) {
					primo = false;
					
				}else {
					a++;
					
				}

			}
			if (primo) {
				dicc[i] = num;
			}

		}
		for (int z = 0; z < dicc.length; z++) {
			System.out.println(dicc[z]);
			
		}
		return dicc;

	}

}
