import java.util.Scanner;
import java.util.InputMismatchException;


public class Main{
	public static void main(String [] args){

		

		double a, b;
		int f;
		int repetir = 0;

		while(repetir == 0){

		Scanner entrada= new Scanner(System.in);

		try{
			System.out.printf("\n(1)Sumar // /(2)Restar //(3)Multiplicar //(4)Dividir //(5)Factorial //(otro)Salir: ");
			int opcion=entrada.nextInt();
			entrada.nextLine(); //Limpiamos buffer

			switch(opcion){

				case 1:
					System.out.printf("\nIngresa el primer sumando: ");
					a=entrada.nextDouble();
					entrada.nextLine();
					System.out.printf("\nIngresa el segundo sumando: ");
					b=entrada.nextDouble();
					entrada.nextLine();
					System.out.println("\nEl resultado es: "+ Calculadora.suma(a, b)+"\n");
					break;

				case 2:
					System.out.printf("\nIngresa el primer término: ");
					a=entrada.nextDouble();
					entrada.nextLine();
					System.out.printf("\nIngresa el segundo término: ");
					b=entrada.nextDouble();
					entrada.nextLine();
					System.out.println("\nEl resultado es: "+ Calculadora.resta(a, b)+"\n");
					break;

				case 3:

					System.out.printf("\nIngresa el primer término: ");
					a=entrada.nextDouble();
					entrada.nextLine();
					System.out.printf("\nIngresa el segundo término: ");
					b=entrada.nextDouble();
					entrada.nextLine();
					System.out.println("\nEl resultado es: "+ Calculadora.multiplicar(a, b)+"\n");
					break;

				case 4:

					System.out.printf("\nIngresa el primer término: ");
					a=entrada.nextDouble();
					entrada.nextLine();
					System.out.printf("\nIngresa el segundo término: ");
					b=entrada.nextDouble();
					entrada.nextLine();
					String resultado = Calculadora.dividir(a, b);
					System.out.println("\n"+resultado+"\n");
					break;

				case 5:

					System.out.printf("\nIngresa el número: ");
					f=entrada.nextInt();
					entrada.nextLine();
					System.out.println("\nEl resultado es: "+Calculadora.factorial(f)+"\n");
					break;

				default:
				
					repetir = 22;
					System.out.println("\nGracias por usarme\n");				
		}

		}catch(InputMismatchException opcioninvalida){
			System.out.println("Has ingresado una opción no válida, vuelve a intentarlo");
		}


		}
	}
}
	