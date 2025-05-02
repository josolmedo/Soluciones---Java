public class Main {
    public static void main(String[] args) {
        Libro n1 = new Libro("La Biblia", "Diosito", 0, "La Iglesia");

        // Imprimir la información del libro
        System.out.println("Título: " + n1.getTitulo());
        System.out.println("Autor: " + n1.getAutor());
        System.out.println("Año de publicación: " + n1.getFechaPublicacion());
        System.out.println("Editorial: " + n1.getEditorial());
    }
}
