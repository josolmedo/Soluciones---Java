import java.util.Scanner;

public class FusionDeCadenas{
	public static void main(String[] args){

		
		Scanner entrada = new Scanner(System.in);

		System.out.printf("\nIngresa una palabra: ");		
		String palabra1 = entrada.nextLine();
		System.out.printf("\nIngresa otra palabra: ");
		String palabra2 = entrada.nextLine();
		
		System.out.println("\nLa combinación intercalada de sus caracteres es: \n");
		
		String palabraFusionada = Solucion.FusionaCadenas(palabra1, palabra2);

		System.out.println(palabraFusionada);



	}
}