import java.util.Random;
import java.util.Scanner;

public class ClosestNumberToZero{
	public static void main(String[] args){

		Random aleatoreidad = new Random();
		Scanner entrada = new Scanner(System.in);

		System.out.printf("\nIngrese un número de elementos a combinar: ");		
		int elementos = entrada.nextInt();
		//entrada.nextLine(); //Limpiar buffer
		int[] nums = new int[elementos];


		for(int i = 0; i<elementos; i++){
			nums[i] = aleatoreidad.nextInt(2*elementos+1) - elementos;  //Genera un numero aleatorio entre 1 y el numero de elementos a ingresar
		}

		System.out.println("\nÉl numero más cercano a 0 del arreglo de numeros: \n");
		System.out.println(FuncionesUtiles.arregloEnFormaDeVector(nums));

		System.out.println("\nEs: ");

		int minimo = Solucion.EncuentraElNumeroMasCercanoACero(nums);

		System.out.println(minimo);



	}
}