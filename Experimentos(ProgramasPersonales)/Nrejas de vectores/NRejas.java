import java.util.List;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class NRejas{
	public static void main(String[] args){

		Random aleatoreidad = new Random();
		Scanner entrada = new Scanner(System.in);
		List<Integer> lista = new LinkedList<Integer>();

		System.out.printf("\nIngrese un número de elementos a combinar: ");		
		int elementos = entrada.nextInt();
		entrada.nextLine(); //Limpiar buffer

		for(int i = 0; i<elementos; i++){
			lista.add(aleatoreidad.nextInt(elementos+1));
		}		
		parejas(lista);
		System.out.println("\nAhora ternas: ");
		ternas(lista);
		System.out.println("\n");

	}
	public static <T> void parejas(List<T> lista){
		String cadena = "[";
		
		for(int i = 0; i < lista.size(); i++){
			for(int j=i+1; j<lista.size(); j++){
				if(i == lista.size()-2){

					cadena = cadena + "("+ lista.get(i) + ", " + lista.get(j) + ")";

				}
				else{

					cadena = cadena + "("+ lista.get(i) + ", " + lista.get(j) + "), ";
				}
			}
		}
		cadena = cadena + "]";
		System.out.println(cadena);
	}

	public static <T> void ternas(List<T> lista){
		String cadena = "[";
		
		for(int i = 0; i < lista.size(); i++){
			for(int j=i+1; j<lista.size(); j++){
				for(int k=j+1; k<lista.size(); k++){
					if(i == lista.size()-3){

						cadena = cadena + "("+ lista.get(i) + ", " + lista.get(j) + ", " + lista.get(k)+ ")";

					}
					else{

						cadena = cadena + "("+ lista.get(i) + ", " + lista.get(j) + ", " + lista.get(k)+ "), ";
					}
				}				
			}
		}
		cadena = cadena + "]";
		System.out.println(cadena);
	}





}