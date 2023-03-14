package TA08_02;
import java.util.Random;

public class Password {
	int longitud;
	String contrasena;

	public Password(){
		this.longitud = 8;
		this.contrasena = "";
	}
	
	public Password(int longitud){
		this.longitud = longitud;
		this.contrasena = genRndPassword(longitud);
	}
	
	private String genRndPassword(int longitud) {
		String password = "";
		Random rnd = new Random();
		for (int i = 0; i < longitud; i++) {
			password += String.valueOf((char)(rnd.nextInt(26) + 'a'));
		}
		return password;
	}
	
	public String getContrasena() {
		return this.contrasena;
	}
	
	public int getLongitud() {
		return this.longitud;
	}
	
}
