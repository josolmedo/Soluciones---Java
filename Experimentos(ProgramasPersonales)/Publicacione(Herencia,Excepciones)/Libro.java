public class Libro extends Publicacion{

	private int numeroPaginas;

	Libro(String titulo, String autor, int numeroPaginas){
		this.titulo=titulo;
		this.autor=autor;
		this.numeroPaginas=numeroPaginas;
	}

	@Override void mostrarInformacion(){
		System.out.printf("\nTítulo: %s, Autor: %s \n", titulo, autor);
	}

	void mostrarNumeroPaginas(){
		System.out.printf("\nEl número de páginas es de %d \n", numeroPaginas);
	}

}