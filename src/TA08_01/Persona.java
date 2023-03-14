package TA08_01;

public class Persona {
	
	// Constantes
	final private char SEXO_POR_DEFECTO = 'H';

	// Atributos
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private float peso;
	private float altura;

	public Persona() {
		this.nombre = "";
		this.edad = 0;
		// this.dni = "00000000A";
		this.sexo = this.SEXO_POR_DEFECTO;
		this.peso = 0;
		this.altura = 0;
	}
	
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		// this.dni = "00000000A";
		if (sexo == 'H' || sexo == 'M') {
			this.sexo = sexo;
		} else {
			System.out.println("Sólo acepta [H] y [M]");
			this.sexo = this.SEXO_POR_DEFECTO;
		}
		this.peso = 0;
		this.altura = 0;
	}
	
	public Persona(String nombre, int edad, String dni, char sexo, int peso, int altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		if (sexo == 'H' || sexo == 'M') {
			this.sexo = sexo;
		} else {
			System.out.println("Sólo acepta [H] y [M]");
			this.sexo = this.SEXO_POR_DEFECTO;
		}
		this.peso = peso;
		this.altura = altura;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setSexo(char sexo) {
		if (sexo == 'H' || sexo == 'M') {
			this.sexo = sexo;
		} else {
			System.out.println("Sólo acepta [H] y [M]");
		}
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public char getSexo() {
		return sexo;
	}

	public float getPeso() {
		return peso;
	}

	public float getAltura() {
		return altura;
	}

	public String getDni() {
		return dni;
	}
	
}
