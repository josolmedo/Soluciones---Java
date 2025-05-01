import java.util.Scanner;
public class EjercicioClaseScanner {

    public static void main (String args[]){

        Scanner console=new Scanner(System.in);
        System.out.println("\nIngrese el titulo del libro: ");
        var titulo=console.nextLine();
        System.out.println("\nAhora ingresa el autor del libro");
        var autor=console.nextLine();
        System.out.println("\n\nEl libro "+titulo+" fue escrito por: "+autor+"\n\n");
    }
    
}
