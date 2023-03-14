import TA08_01.Persona;

public class TA08_01_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona1 = new Persona();
		Persona persona2 = new Persona("Pedro", 15, 'M');
		Persona persona3 = new Persona("-LELE", 23, "34420211B", 'M', 70, 1800);
		
		// Print persona 1
		System.out.println(persona1.getNombre() + ":");
		System.out.println("Edad: " + persona1.getEdad());
		System.out.println("DNI: " + persona1.getDni());
		System.out.println("Sexo: " + persona1.getSexo());
		System.out.println("Peso: " + persona1.getPeso());
		System.out.println("Peso: " + persona1.getAltura());
		
		// Print persona 2
		System.out.println(persona2.getNombre() + ":");
		System.out.println("Edad: " + persona2.getEdad());
		System.out.println("DNI: " + persona2.getDni());
		System.out.println("Sexo: " + persona2.getSexo());
		System.out.println("Peso: " + persona2.getPeso());
		System.out.println("Peso: " + persona2.getAltura());
		
		// Print persona 3
		System.out.println(persona3.getNombre() + ":");
		System.out.println("Edad: " + persona3.getEdad());
		System.out.println("DNI: " + persona3.getDni());
		System.out.println("Sexo: " + persona3.getSexo());
		System.out.println("Peso: " + persona3.getPeso());
		System.out.println("Peso: " + persona3.getAltura());
		
	}

}
