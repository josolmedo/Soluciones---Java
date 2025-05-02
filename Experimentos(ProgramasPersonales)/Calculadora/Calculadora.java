public class Calculadora{

	public static double suma(double a, double b){
		
		return a+b;
	}

	public static double resta(double a, double b){
		return a-b;
	}

	public static double multiplicar(double a, double b){
		return a*b;
	}

	public static String dividir(double a, double b) throws ArithmeticException{

		try{
			double c=a/b;
			String division="El resultado es: "+c;
			return division;

		} catch(ArithmeticException e) {
			String resultado;
			resultado="Estás intentado dividir entre cero";

			return resultado;
		}
	}

	public static int factorial(int a){
		if(a==1){
			return 1;
		}
		return a*factorial(a-1);
	}

		

	
}