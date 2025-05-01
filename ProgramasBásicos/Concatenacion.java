//Esste es un comentario en Java
//La clase publica principal debe llamarse igual a como vamos a guardar el programa
// Las clases inician con mayúscula y las variables con minúscula
// Al final de cada sentencia debemos agregar ;
public class Concatenacion {
    public static void main(String args[]){
        
     var nombre="José";
     var titulo="Ingeniero";
     var union=nombre + " " +titulo; //Se concatena con el signo +

     System.out.println("\n"+union);

     var i=23;
     var j=18;

     System.out.println(i + j); // Sí realizará la suma dado que son var las ve como variables enteras
     System.out.println(i+j+ " "+ nombre); //Así realizará primero la suma de los numeros enteros y concatenará con la cadena
     System.out.println(nombre +" "+ i+j); //Aquí concatenará todo, debido a que el primer elemento leído de izquierda a derecha es una cadena.
     System.out.println(nombre +" "+ (i+j)+"\n"); //Aquí si se realizará la suma porque agrupamos con paréntesis y se priorizan.



    }
    
}
