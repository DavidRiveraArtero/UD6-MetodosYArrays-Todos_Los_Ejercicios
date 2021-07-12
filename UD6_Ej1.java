import javax.swing.JOptionPane;
public class UD6_Ej1 {

	public static void main(String[] args) {
		
		String figura = JOptionPane.showInputDialog("QUE FIGURA QUIERES CALCULAR ");
		
		switch (figura) {
			case "Circulo":
				Double resultado=Circulo(figura);
				JOptionPane.showInternalMessageDialog(null, "El resultado de "+ figura + "es: " + resultado);
				break;
				
			case "Triangulo":
				Double resultado2=Triangulo(figura);
				JOptionPane.showInternalMessageDialog(null, "El resultado de "+ figura + "es: " + resultado2);
				break;
			
			case "Cuadrado":
				Double resultado3=Cuadrado(figura);
				JOptionPane.showInternalMessageDialog(null, "El resultado de "+ figura + "es: " + resultado3);
				break;

		
		}
		

	}

	public static Double Circulo (String figura) {
		String num = JOptionPane.showInputDialog("Dame el radio del circulo ");
		Double radio = Double.parseDouble(num); 
		radio = Math.pow(radio, 2);
		Double resultado = (Double) (radio * 3.14);
		return resultado;
	}
	
	public static Double Triangulo (String figura) {
		//LE PEDIMOS AL USUARIO QUE INTRODUZCA LA INFORMACION
		String num = JOptionPane.showInputDialog("Dame la base del triangulo ");
		String num2 = JOptionPane.showInputDialog("Dame la altura del triangulo ");
		
		//LUEGO LO PASAMOS A DOUBLE PARA PODER TRABAJAR CON LA INFORMACION
		Double base = Double.parseDouble(num); 
		Double altura = Double.parseDouble(num2); 
		
		//HACEMOS LA OPERACION			บบ
		Double resultado2= (Double) ((base * altura) / 2);
		
		return resultado2;
	}
	
	public static Double Cuadrado (String figura) {
		String num = JOptionPane.showInputDialog("Dame el primer lado del cuadrado ");
		String num2 = JOptionPane.showInputDialog("Dame el segundo lado del cuadrado ");
		
		//LUEGO LO PASAMOS A DOUBLE PARA PODER TRABAJAR CON LA INFORMACION
		Double lado1 = Double.parseDouble(num); 
		Double lado2 = Double.parseDouble(num2);
		
		Double resultado3= (Double) (lado1 * lado2);
		return resultado3;
	}
}
