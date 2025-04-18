public class Contiene{
	public static boolean estaLetra(char letra, String cadenaMisteriosa){
		char[] ArregloDeCadenaMisteriosa = cadenaMisteriosa.toCharArray();


		for(char letrita: ArregloDeCadenaMisteriosa){
			if(letra == letrita){
				return true;
			}
		}
		return false;
	}
}