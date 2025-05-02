import java.util.Scanner;
import java.util.InputMismatchException;

public class Main{
	public static void main(String [] args){

		Scanner scanner = new Scanner(System.in);
		int intento=1;

		while(intento == 1){

			try{

			System.out.printf("\n\nIngresa lo que desees registrar (1)Libro / (2)Revista / (otro)Salir: ");
			int opcion = scanner.nextInt();
			scanner.nextLine(); //Limpiar el buffer
			if(opcion == 1){

				try{

				System.out.printf("\nIngresa el autor: ");
				String autor = scanner.nextLine();
				System.out.printf("\nIngresa el título: ");
				String titulo = scanner.nextLine();
				System.out.printf("\nIngresa el número de páginas: ");
				int numeroPaginas = scanner.nextInt();
				scanner.nextLine(); //Limpamos el buffer.
				Libro libro1 = new Libro(autor, titulo, numeroPaginas);

				libro1.mostrarInformacion();
				libro1.mostrarNumeroPaginas();

				} catch (InputMismatchException e){

					scanner.nextLine(); //Atrapamos el error

					System.out.println("\n--------------Opcion no valida--------------\n");
					System.out.printf("¿Deseas volver a intentarlo?  (1)Si / (otro)No: ");
					try{
						intento = scanner.nextInt();
						scanner.nextLine(); //Limpiamos el buffer
					} catch(InputMismatchException p){
						intento = 3;
					}
				}
			}

			else if(opcion == 2){

				try{

				System.out.printf("\nIngresa el autor: ");
				String autor = scanner.nextLine();
				System.out.printf("\nIngresa el título: ");
				String titulo = scanner.nextLine();
				System.out.printf("\nIngresa el número de edición: ");
				int numeroEdicion = scanner.nextInt();
				scanner.nextLine(); //Limpamos el buffer.
				Revista revista1 = new Revista(autor, titulo, numeroEdicion);

				revista1.mostrarInformacion();
				revista1.mostrarNumeroEdicion();

				} catch (InputMismatchException a){

					scanner.nextLine(); //Atrapamos el error

					System.out.println("\n--------------Opcion no valida--------------\n");
					System.out.printf("¿Deseas volver a intentarlo?  (1)Si / (otro)No: ");
					try{
						intento = scanner.nextInt();
						scanner.nextLine(); //Limpiamos el buffer
					} catch(InputMismatchException b){
						intento = 3;
					}
				}
			}

			else {
				intento = 3;
			}

			} catch (InputMismatchException q){

				scanner.nextLine(); //Atrapamos el error
				System.out.println("\n--------------Opcion no valida--------------\n");
				System.out.printf("¿Deseas volver a intentarlo?  (1)Si / (otro)No: ");
				try{
					intento = scanner.nextInt();
					scanner.nextLine(); //Limpiamos el buffer									
				} catch(InputMismatchException r){
					intento = 2;
				}				
				
			}

		}
		scanner.close();

		System.out.println("\n------------------Gracias por usar nuestro sistema------------------\n");


	}
}