public class EsSubsecuencia{
	public static boolean de(String cadenaOriginal, String cadenaMisteriosa){
		
		char[] arregloCadenaMisteriosa = cadenaMisteriosa.toCharArray();
		StringBuilder verificador = new StringBuilder();
		
		for(char letra: arregloCadenaMisteriosa){
			if(Contiene.estaLetra(letra, cadenaOriginal)){
				verificador.append(letra);
			}
		}

		if(verificador.toString().equals(cadenaOriginal)){
			return true;
		}
		return false;



	}	
}