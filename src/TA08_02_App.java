import TA08_02.Password;

public class TA08_02_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Password psw = new Password();
		Password psw2 = new Password(10);
		
		System.out.println(psw.getContrasena());
		System.out.println(psw2.getContrasena());
		
	}

}
