//DAVID RIVERA ARTERO

//LO QUE HACE EL PROGRAMA ES AÑADIR NUMEROS A UNA LISTA Y LUEGO PASARLA A OTRA DE FORMA DESORDENADA Y LUEGO SE MULTIPLICA 
import javax.swing.JOptionPane;
public class UD6_Ej11_App {

	public static void main(String[] args) {
		String num = JOptionPane.showInputDialog("DAME EL TAMAÑO DE LA LISTA");
		int tamaño = Integer.parseInt(num);
		int listado1[] = new int[tamaño];
		int listado2[] = new int[tamaño];
		int listadomulti[] = new int[tamaño];
		
		//LLAMAMOS AL PRIMER METODO
		int[] resultado= aleatorio(listado1);
		
		//LLAMAMOS AL METODO DE MEZCLAR LOS NUMEROS ENTRE LISTADOS
		int[] resultado2= mezclar(listado1, listado2);
		
		int[] resultado3= multiplicar(listado1, listado2, listadomulti);
	}
	
	public static int[] aleatorio(int[] listado1) {
		int num1 = 0;
		int num2 = 100;
		
		for (int i = 0; i < listado1.length;i++) {
			int num = (int) Math.floor(Math.random() * (num1 - (num2 + 1)) + (num2));
			listado1[i] = num;
			
		}
		
		return listado1;
		
	}
	public static int[] mezclar(int[] listado1, int[] listado2) {
		for (int a = 0; a<listado1.length; a++) {
			listado2[a]=listado1[a];
			
		}
		
		return listado2;
			
	}
	
	public static int[] multiplicar(int[] listado1, int[] listado2, int[] listadomulti) {
		
		for (int i = 0; i < listado1.length; i++) {
			int mult = 0;
			mult = listado1[i] * listado2[i];
			listadomulti[i] = mult;
			
		}
		for (int z = 0; z < listadomulti.length; z++) {
			JOptionPane.showMessageDialog(null,"La multiplicacion de " + listado1[z] + " * " + listado2[z] + " es: " + listadomulti[z]);
		}
		
		return listado2;
		
		
	}

}
