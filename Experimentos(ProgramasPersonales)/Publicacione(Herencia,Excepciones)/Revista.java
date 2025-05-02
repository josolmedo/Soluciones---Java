public class Revista extends Publicacion{

	private int numeroEdicion;

	Revista(String titulo, String autor, int numeroEdicion){
		this.titulo = titulo;
		this.autor = autor;
		this.numeroEdicion = numeroEdicion;
	}

	@Override void mostrarInformacion(){
		System.out.printf("\nTítulo: %s, Autor: %s\n", titulo, autor);
	}

	void mostrarNumeroEdicion(){
		System.out.printf("\nEl número de esta edición es de: %s\n", numeroEdicion);
	}
}