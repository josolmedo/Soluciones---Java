import java.util.Scanner;

public class Anagrama {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in)

        String palabra = "Pantorrilla";
        String[] letras = palabra.split(""); // Divide cada carácter

        for (String letra : letras) {
            System.out.println(letra);
        }
    }
}