import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.printf("\nIngresa un número: ");
        int numero = entrada.nextInt();
        entrada.nextLine();
        

        System.out.println("\nFibonacci Recursivo: \n");
        Fibonacci.fibonacciIterativoImpresion(numero);

       

        System.out.println("\nFibonacci Iterativo: \n");
        Fibonacci.fibonacciIterativoImpresion(numero);
    }
}