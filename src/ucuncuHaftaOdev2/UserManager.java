package ucuncuHaftaOdev2;

public class UserManager {
	public void add(User user) {
		System.out.println("Sisteme eklenen kullanýcýnýn ismi: "+user.getName());
	}
	public void delete(User user) {
		System.out.println("Sistemden silinen kullanýcýnýn ismi: "+user.getName());
	}
	public void update(User user) {
		System.out.println(user.getName()+" adlý kullanýcýn bilgileri güncellendi..");
	}
	public void logIn(User user) {
		System.out.println(user.getName()+" sisteme giriþ yaptý..");
	}
	public void logOut(User user) {
		System.out.println(user.getName()+" sistemden çýkýþ yaptý..");
	}
	

}
