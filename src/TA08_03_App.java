import TA08_03.Electrodomestico;

public class TA08_03_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Electrodomestico elec1 = new Electrodomestico();
		Electrodomestico elec2 = new Electrodomestico(16, 16);
		Electrodomestico elec3 = new Electrodomestico(3.0, "rojo", 'A', 15);
		
		System.out.println("Precio base: " + elec1.getPrecio_base());
		System.out.println("Color: " + elec1.getColor());
		System.out.println("Peso: " + elec1.getPeso());
		System.out.println("Consumo energético: " + elec1.getConsumo_energetico());
		
		System.out.println("Precio base: " + elec2.getPrecio_base());
		System.out.println("Color: " + elec2.getColor());
		System.out.println("Peso: " + elec2.getPeso());
		System.out.println("Consumo energético: " + elec2.getConsumo_energetico());
		
		System.out.println("Precio base: " + elec3.getPrecio_base());
		System.out.println("Color: " + elec3.getColor());
		System.out.println("Peso: " + elec3.getPeso());
		System.out.println("Consumo energético: " + elec3.getConsumo_energetico());
	}

}
