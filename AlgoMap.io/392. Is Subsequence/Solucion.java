public class Solucion{
	public static void main(String[] args){

		String cadenaOriginal = "ab";
		String cadenaMisteriosa = "baab";

		boolean respuesta = EsSubsecuencia.de(cadenaOriginal, cadenaMisteriosa);

		if(respuesta){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}

	}
}