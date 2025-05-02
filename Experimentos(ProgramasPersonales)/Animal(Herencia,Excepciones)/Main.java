import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creado FUERA del ciclo
        int intento = 1;

        while (intento == 1) {
            try {
                System.out.println("\n----Presiona Enter para iniciar----");
                scanner.nextLine(); // Limpiar buffer o esperar Enter

                System.out.print("\nIngresa la raza de tu perro: ");
                String raza = scanner.nextLine();

                if(raza.isEmpty()) {
                    throw new NoSuchElementException();
                }                

                System.out.print("\nIngrese la esperanza de vida (años): ");
                int esperanzaVida = scanner.nextInt();

                System.out.print("\nIngresa la edad de tu perro (años): ");
                int edad = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer después de nextInt()

                System.out.print("\nIngresa el nombre de tu perro: ");
                String nombre = scanner.nextLine();

                if(nombre.isEmpty()) {
                    throw new NoSuchElementException();
                }

                Perro p1 = new Perro(raza, esperanzaVida, edad, nombre);
                p1.interactuar(p1);

                System.out.print("¿Quieres ingresar otro perro al sistema? (1:Sí / 0:No): ");
                intento= scanner.nextInt();

                

            } catch (IllegalArgumentException e) {
                System.err.println("\nError al crear el perro: " + e.getMessage());
                intento = preguntarReintento(scanner);
            } catch (InputMismatchException e) {
                System.err.println("\nError: Ingresa un número válido.");
                scanner.nextLine(); // Limpiar entrada incorrecta
                intento = preguntarReintento(scanner);
            } catch (NoSuchElementException e) {
                System.err.println("\nError: No se ingresó ningún dato.");
                intento = preguntarReintento(scanner);
            }
        }

        System.out.println("\n\n----Ojalá nos visite pronto----\n\n");
        scanner.close(); // Cerrar el Scanner al final del programa
    }

    // Método para preguntar si se desea reintentar
    private static int preguntarReintento(Scanner scanner) {
        System.out.print("\n¿Reintentar? (1: Sí / Otro: No): ");
        try {
            int intento=scanner.nextInt();
            if (intento!=1){
                throw new InputMismatchException();
            }
            return intento;

        } catch (InputMismatchException e) {
            System.out.println("\n\n....Muchas gracias por usar nuestro sistema....\n\n");
            return 0; // Si no ingresa un número, asumimos "No"
        } finally {
            scanner.nextLine(); // Limpiar el buffer
        }
    }
}