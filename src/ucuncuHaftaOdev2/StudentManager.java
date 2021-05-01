package ucuncuHaftaOdev2;

public class StudentManager extends UserManager {

	@Override
	public void add(User user) {
		System.out.println("Sisteme eklenen öðrencinin ismi: "+user.getName());
	}

	@Override
	public void delete(User user) {
		System.out.println("Sistemden silinen öðrencinin ismi: "+user.getName());
	}

	@Override
	public void update(User user) {
		System.out.println(user.getName()+" adlý öðrenci sistemde güncellendi...");
	}

	@Override
	public void logIn(User user) {
		System.out.println("Sisteme giriþ yapan öðrencinin ismi: "+user.getName());
	}

	@Override
	public void logOut(User user) {
		System.out.println(user.getName()+" adlý öðrenci sistemden çýkýþ yaptý...");
		
	}
	

	
}
