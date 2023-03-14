import TA08_04.Serie;

public class TA08_04_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Serie ser1 = new Serie();
		Serie ser2 = new Serie("Doom", "John Carmack & John Romero");
		Serie ser3 = new Serie("Cosas viles", 5, "Terror", "Adrià Linares");
		
		System.out.println("Creador: " + ser1.getCreador());
		System.out.println("Título: " + ser1.getTitulo());
		System.out.println("Número de temporadas: " + ser1.getNumero_temporadas());
		System.out.println("Género: " + ser1.getGenero());
		System.out.println("Entregado: " + ser1.isEntregado());
		
		System.out.println("Creador: " + ser2.getCreador());
		System.out.println("Título: " + ser2.getTitulo());
		System.out.println("Número de temporadas: " + ser2.getNumero_temporadas());
		System.out.println("Género: " + ser2.getGenero());
		System.out.println("Entregado: " + ser2.isEntregado());
		
		System.out.println("Creador: " + ser3.getCreador());
		System.out.println("Título: " + ser3.getTitulo());
		System.out.println("Número de temporadas: " + ser3.getNumero_temporadas());
		System.out.println("Género: " + ser3.getGenero());
		System.out.println("Entregado: " + ser3.isEntregado());
		
	}

}
