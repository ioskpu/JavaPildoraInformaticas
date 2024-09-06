import javax.lang.model.element.Element;

public class ConstantesOperadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final double aPulgadas = 2.54;
		
		double cm = 10;
		
		double resultado = cm / aPulgadas;
		
		System.out.println("En " + cm + " cm hay " + resultado + " pulgadas");
		
		//otra forma de declarar constantes
		
		int operador1, operador2, resultadoSuma;
		
		operador1 = 10;
		
		operador2 = 20;
		
		resultadoSuma = operador1 + operador2;
		
		System.out.println("El resultados de la suma de las constantes es: " + resultadoSuma);

	}

}
