
public class Declariones_Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		
		int b;
		
		b = 10;
		
		int c = a+b; //operador suma
		
		c ++; //incremento en uno el valor de la variable
		
		System.out.println("la suma de las variables es: " + c);
		
		//incrementar el valor de la variable en un numero dado
		
		c += 4;
		
		System.out.println("ahora el valor de la variable c a cambiado por el incremento pasado en la variable: " + c);

		double d = 7;
		
		double e = 4;
		
		double f = d/e; //operador divicion se usa tipo de datos double para manejar los decimales
		
		System.out.println("el valor de la variable al dividir es: " + f);
		
		//operador de resta
		
		double g = d-e;
		
		System.out.println("el valor de g va ser la resta ahora de las variables d y e: " + g);
		
		g -= 2; 
		
		System.out.println("aca hacemos decremento en 2 de la variable g: " + g);
	}

}
