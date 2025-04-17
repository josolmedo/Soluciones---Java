public class Solucion {
    public static String FusionaCadenas(String palabra1, String palabra2) {

        String palabraFusionada = "";
        char[] arregloPalabra1 = palabra1.toCharArray();
        char[] arregloPalabra2 = palabra2.toCharArray();
        int contador1 = 0;
        int contador2 = 0;

             
        while(contador1<arregloPalabra1.length){
                palabraFusionada = palabraFusionada + arregloPalabra1[contador1];
                while (contador2<arregloPalabra2.length){
                    palabraFusionada = palabraFusionada + arregloPalabra2[contador2];
                    contador2++;
                    if(contador1 == arregloPalabra1.length - 1){
                       for(int contador3 = contador2; contador3<arregloPalabra2.length; contador3++){
                            palabraFusionada = palabraFusionada + arregloPalabra2[contador3];
                       }
                    }
                    break;
                }            
                contador1++;                                       
        }
        return palabraFusionada;              
    }    
}

/*Una solución mejor:

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }
            i++;
        }
        return result.toString();
    }
}*/
