//Esste es un comentario en Java
//La clase publica principal debe llamarse igual a como vamos a guardar el programa
// Las clases inician con mayúscula y las variables con minúscula
// Al final de cada sentencia debemos agregar ;

import java.util.Scanner;
public class ClaseScanner {
    public static void main(String args[]){

        System.out.println("Escribe tu nombre: ");
        Scanner consola=new Scanner(System.in); //Creamos un objeto de la clase consola
        // System.in ese para que el sistma de ingreso sea el que está por defecto, es decir el sistema
        // e .in es para input.
        var usuario=consola.nextLine();
        System.out.println("usuario= "+usuario);

        //Ya no será necesario volver a crear un objeto Scanner
        //se puede reutilizar, solo añadir el .nextLine().

        System.out.println("Ingresa el titulo universitario de esta persona: ");
        var titulo=consola.nextLine();
        System.out.println(usuario+" tiene el titulo de: "+titulo);


        
     

    }
    
}
