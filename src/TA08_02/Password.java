package TA08_02;
import java.util.Random;

public class Password {
	
	final private int LONGITUD_POR_DEFECTO = 8;
	
	private int longitud;
	private String contrasena;

	public Password(){
		this.longitud = this.LONGITUD_POR_DEFECTO;
		this.contrasena = genRndPassword(this.longitud);
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
