import java.util.Scanner;
import java.util.InputMismatchException;


public class FizzBuzz{
	public static void imprime(int i) throws InputMismatchException{


		int contador=1;
		while(contador!=i){
			
			if(contador % 3 == 0 && contador % 5 == 0){
				System.out.println("FizzBuzz");
			}
			else if(contador % 3 == 0){
				System.out.println("Fizz");
			}
			else if(contador % 5 == 0){
				System.out.println("Buzz");
			}
			else{
				System.out.println(contador);
			}
			
			contador++;

		}
		System.out.println("\n");
	}
	public static void main(String [] args){

		try{

			Scanner entrada = new Scanner(System.in);
			System.out.printf("\nIngresa el número de FizzBuzzes que quieres calcular: ");
			int numero = entrada.nextInt();
			entrada.nextLine();
			FizzBuzz.imprime(numero);

		} catch(InputMismatchException e){
			System.out.println("\nIntroduciste una letra en vez de un número, vuelve a ejecutar el programa\n");
		}
	}

}