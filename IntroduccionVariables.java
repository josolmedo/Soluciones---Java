//Esste es un comentario en Java
//La clase publica principal debe llamarse igual a como vamos a guardar el programa
// Las clases inician con mayúscula y las variables con minúscula
// Al final de cada sentencia debemos agregar ;
public class IntroduccionVariables {
    public static void main(String args[]){
        
        int miVariableEntera=10;
        System.out.println(miVariableEntera);
        //Modificando el valor de la variable        
        miVariableEntera=5; 
        System.out.println("\n"+miVariableEntera);     
        
        String miVariableCadena="\nWilson";
        System.out.println("\n"+miVariableCadena);

        //var palabra reservada para inferencia de tipos de datos
        var miVariableEntera2=15; //Java va a inferir que se trata de una variable entera
        System.out.println("\n"+miVariableEntera2);

        var miVariableCadena2="Moikatron";
        System.out.println("\nmiVariableCadena2= "+miVariableCadena2);


    }
    
}
