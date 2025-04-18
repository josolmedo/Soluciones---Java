import java.util.Scanner;

public class Solucion{
	public static void main (String[] args){

		Scanner entrada = new Scanner(System.in);
		System.out.printf("\nIngresa un número romano del 1 al 3999: ");
		String numeroRomano = entrada.nextLine();

		int numeroNormal = RomanosAEnteros.calcula(numeroRomano);
		System.out.printf("\nEl número romano %s es: %d\n\n", numeroRomano, numeroNormal);

	}
}