//DAVID RIVERA ARTERO

//LO QUE HACE EL PROGRAMA ES AÑADIR NUMERO A UNA LISTA PERO SOLO DE LOS NUMERO QUE NOSOTROS QUEREMOS EJ TODOS LOS NUMEROS QUE TENGAN UN 7
import javax.swing.JOptionPane;
public class UD6_Ej12_App {

	public static void main(String[] args) {
		String num = JOptionPane.showInputDialog("DAME EL TAMAÑO DE LA LISTA");
		int tamLista = Integer.parseInt(num);
		int list[] =  new int[tamLista];
		int[] resultado= aleatorio(list);
	}
	
	public static int[] aleatorio(int[] list) {
		int num1 = 1;
		int num2 = 300;
		
		String ultnum = JOptionPane.showInputDialog("DAME EL NUMERO POR EL QUE TERMINARA: ");
		
		for (int i = 0; i < list.length;i++) {
			int num = (int) Math.floor(Math.random() * (num1 - (num2 + 1)) + (num2));
			String cadena = num+"";
			
			
			
			Integer numF = Integer.parseInt(cadena);
			if (cadena.contains(ultnum)) {
				
				list[i] = numF;
				
				
			}
			
		}
		for (int a = 0; a < list.length; a++) {
			System.out.println(list[a]);
		}
		
		return list;
		
		
	}
	

}
