import java.util.Scanner;
import java.util.InputMismatchException;

public class Anagrama{

    public static void saltoDeLinea(){
        System.out.printf("\n");
    }
    
    public static void imprime(String mensaje){
        System.out.printf(mensaje);
    }

    public static void cambia(String[] arreglo, int i, int j){
        String temporal = new String(arreglo[j]);
        arreglo[j] = arreglo[i];
        arreglo[i] = temporal;
    }

    public static void quickSort(String[] arreglo, int start, int end){
        if(start>=end){
            return;
        }        

        int pivote = end;
        int i = start;
        int j = pivote-1;

        while(i <= j){
            if(arreglo[i].compareTo(arreglo[pivote])>0 && arreglo[j].compareTo(arreglo[pivote])<=0){
                cambia(arreglo, i, j);
                i++;
                j--;
            }else if(arreglo[i].compareTo(arreglo[pivote])<=0){
                i++;
            }else{
                j--;
            }
        }
        cambia(arreglo, i, pivote);
              
        quickSort(arreglo, start, i-1);
        quickSort(arreglo, i+1, end);

    }

    public static boolean anagrama(String cadena1, String cadena2){

        if(cadena1.equals(cadena2) || cadena1.length() != cadena2.length()){
            return false;
        }
        
        String[] arregloCadena1 = cadena1.split("");
        String[] arregloCadena2 = cadena2.split("");
        quickSort(arregloCadena1, 0, arregloCadena1.length-1);
        quickSort(arregloCadena2, 0, arregloCadena2.length-1);

        StringBuilder cadena1Nueva = new StringBuilder();
        StringBuilder cadena2Nueva = new StringBuilder();

        for(String palabra: arregloCadena1){
            cadena1Nueva.append(palabra);
        }

        for(String palabra: arregloCadena2){
            cadena2Nueva.append(palabra);
        }

        cadena1 = cadena1Nueva.toString();
        cadena2 = cadena2Nueva.toString();

        if(cadena1.equals(cadena2)){
            return true;
        }
        return false;
    }






    public static void main(String[] args){
        int continuar = 1;
        Scanner entrada = new Scanner(System.in);       
            
        while(continuar==1){
            try{
                saltoDeLinea();
                imprime("Ingresa la primer palabra: ");
                String palabra1 = entrada.nextLine();
                saltoDeLinea();
                imprime("Ingresa la segunda palabra: ");
                String palabra2 = entrada.nextLine();
                saltoDeLinea();

                palabra1 = palabra1.toLowerCase();
                palabra2 = palabra2.toLowerCase();

                boolean respuesta = anagrama(palabra1, palabra2);

                if(respuesta){
                    System.out.println("Si es anagrama");
                }
                else{
                    System.out.println("No es anagrama");
                }
                saltoDeLinea();

                imprime("¿Desea volver a intentar? 1(si)/otro(no): ");
                continuar = entrada.nextInt();
                entrada.nextLine();                 
            }            
            catch(InputMismatchException e){
                continuar = 2;
                entrada.close();
            }
        }

        entrada.close();        
        saltoDeLinea();
        imprime("Gracias por utilizar este programa :)");
        saltoDeLinea();
        saltoDeLinea();          
    }
}