package ucuncuHaftaOdev2;

public class UserManager {
	public void add(User user) {
		System.out.println("Sisteme eklenen kullan�c�n�n ismi: "+user.getName());
	}
	public void delete(User user) {
		System.out.println("Sistemden silinen kullan�c�n�n ismi: "+user.getName());
	}
	public void update(User user) {
		System.out.println(user.getName()+" adl� kullan�c�n bilgileri g�ncellendi..");
	}
	public void logIn(User user) {
		System.out.println(user.getName()+" sisteme giri� yapt�..");
	}
	public void logOut(User user) {
		System.out.println(user.getName()+" sistemden ��k�� yapt�..");
	}
	

}
