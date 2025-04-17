public class FuncionesUtiles<T>{

	public static <T extends Comparable<T>> T maximoEntreDosNumeros(T a, T b){
		return a.compareTo(b)>0?a:b;
	}

	public static <T extends Comparable<T>> T minimoEntreDosNumeros(T a, T b){
		return a.compareTo(b)>0?b:a;
	}

	public static int valorAbsoluto(int a){
		return a>0?a:-1*a;
	}

	public static double valorAbsoluto(double a){
		return a>0?a:-1*a;
	}

	public static <T extends Comparable<T>> T maximoNumeroEnUnArregl(T[] arreglo){
		T maximo = arreglo[0];
		T valorActual;
		for(int contador = 0; contador < arreglo.length; contador++){
			valorActual = arreglo[contador];
			if(valorActual.compareTo(maximo) > 0){
				maximo = valorActual;
			}			
		}
		return maximo;
	}

	public static <T extends Comparable<T>> T minimoNumeroEnUnArregl(T[] arreglo){
		T minimo = arreglo[0];
		T valorActual;
		for(int contador = 0; contador < arreglo.length; contador++){
			valorActual = arreglo[contador];
			if(valorActual.compareTo(minimo) < 0){
				minimo = valorActual;
			}			
		}
		return minimo;
	}

	public static String arregloEnFormaDeVector(double[] arreglo){
		String cadena = "[";
		int contador = 0;
		if(arreglo == null){
			return "[]";
		}
		for(double elemento: arreglo){
			contador++;
			if(contador == arreglo.length){
				cadena = cadena + elemento + "]";
				return cadena;
			}
			cadena = cadena + elemento + ", ";			
		}
		return cadena;
	}

	public static String arregloEnFormaDeVector(String[] arreglo){
		String cadena = "[";
		int contador = 0;
		if(arreglo == null){
			return "[]";
		}
		for(String elemento: arreglo){
			contador++;
			if(contador == arreglo.length){
				cadena = cadena + elemento + "]";
				return cadena;
			}
			cadena = cadena + elemento + ", ";			
		}
		return cadena;
	}

	public static String arregloEnFormaDeVector(int[] arreglo){
		String cadena = "[";
		int contador = 0;
		if(arreglo == null){
			return "[]";
		}
		for(int elemento: arreglo){
			contador++;
			if(contador == arreglo.length){
				cadena = cadena + elemento + "]";
				return cadena;
			}
			cadena = cadena + elemento + ", ";			
		}
		return cadena;
	}
}

/*a.compareTo(b) devuelve:

> 0 si a > b

0 si a == b

< 0 si a < b

*/