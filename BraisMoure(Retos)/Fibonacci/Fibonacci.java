public class Fibonacci{

    public static void cambia(int i, int j){
        int temporal = j;
        j = i;
        i = temporal;
    }
    public static int fibonacciRecursivo(int numero){

        if(numero == 0){
            return 0;
        }
        else if(numero == 1){
            return 1;
        }

        return fibonacciRecursivo(numero-1) + fibonacciRecursivo(numero-2); // j + i
    }

    public static int fibonacciIterativo(int numero){

        if(numero <= 0){
            return 0;
        }
        else if(numero == 1){
            return 1;
        }

        int i = 1;
        int j = 0;
        int suma = 0;

        for(int contador = 1; contador < numero; contador++){ //minimo llega a 1
            suma = i + j;
            j = i;
            i = suma;      


        }

        return suma;

    }

    public static void fibonacciIterativoImpresion(int numero){
        StringBuilder constructor = new StringBuilder();
        String cosa;

        for(int contador = 0; contador < numero; contador++){
            cosa = String.valueOf(fibonacciIterativo(contador));
            constructor.append(cosa + ", ");
            
        }
        cosa = String.valueOf(fibonacciIterativo(numero));
        constructor.append(cosa);

        String sucesion = constructor.toString();

        System.out.println("\n"+sucesion+"\n");
    }

    public static void fibonacciRecursivoImpresion(int numero){

        StringBuilder constructor = new StringBuilder();
        String cosa;

        for(int contador = 0; contador < numero; contador++){
            cosa = String.valueOf(fibonacciRecursivo(contador));
            constructor.append(cosa + ", ");
            
        }
        cosa = String.valueOf(fibonacciRecursivo(numero));
        constructor.append(cosa);

        String sucesion = constructor.toString();

        System.out.println("\n"+sucesion+"\n");

    }
}

/**Si n==1 devuelve 0
 * Si n==0 devuelve 0
 * 
 * Sino, devuelve n-1+n-2**/