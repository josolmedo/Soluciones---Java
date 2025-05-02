public class Perro extends Animal{ //Hereda de clase abstracta animal

	private final String raza;  //final porque nunca será modificada
	private int edad;
	private final int esperanzaVida; //final porque nunca será modificada
	private final String nombre; //final porque nunca será modificada

	/**Constructor**/

	public Perro(String raza, int esperanzaVida, int edad, String nombre) throws IllegalArgumentException{
		if (edad<0 || esperanzaVida<=0){
			throw new IllegalArgumentException("Ingresa la edad y esperanza de vida correcta.");
		}

		this.raza=raza;
		this.esperanzaVida=esperanzaVida;
		this.edad=edad;
		this.nombre=nombre;
	}

	@Override void hacerSonido(){
		System.out.println("\nGuau Guau");
	}

	@Override void dormir(){
		System.out.println("\nEstoy durmiendo....\n");
	}

	public void saludar(){
		System.out.println(String.format("%nSaludos, soy un perro, me llamo %s, de raza %s y tengo %d años de edad", nombre, raza, edad));
	}

	@Override public String toString(){
		return String.format("Perro[nombre=%s, raza=%s, edad=%d años, esperanza de vida=%d años]", nombre, raza, edad, esperanzaVida);
		
	}

	public void interactuar(Perro perro) {
        perro.saludar();
        perro.hacerSonido();
        perro.dormir();
        System.out.println("Información del perro: " + perro.toString()+"\n");
    }

}