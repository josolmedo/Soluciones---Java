public class RomanosAEnteros{

	public static int calcula(String numeroRomano){

        numeroRomano = numeroRomano.toUpperCase();        
        int valorActual;
        int numeroFinal = 0;
        char[] arregloDeNumeroRomano = numeroRomano.toCharArray();

        for(int i = 0; i < numeroRomano.length(); i++){
            valorActual = Valuador.romanos(arregloDeNumeroRomano[i]);

            if(i+1 < numeroRomano.length() && valorActual < Valuador.romanos(arregloDeNumeroRomano[i+1])){ //Si hay siguiente y si la letra actual es mayor o igual a la que sigue
                numeroFinal-= valorActual;
            }
            else{
                numeroFinal+=valorActual;
            }            
        }
        return numeroFinal;		
	}
}