public class FuncionesUtiles<T>{

	public static <T extends Comparable<T>> T maximo(T a, T b){
		return a.compareTo(b)>0?a:b;
	}

	public static <T extends Comparable<T>> T minimo(T a, T b){
		return a.compareTo(b)>0?b:a;
	}

	public static int valorAbsoluto(int a){
		return a>0?a:-1*a;
	}

	public static double valorAbsoluto(double a){
		return a>0?a:-1*a;
	}
}

/*compareTo() devuelve:

> 0 si a > b

0 si a == b

< 0 si a < b

*/