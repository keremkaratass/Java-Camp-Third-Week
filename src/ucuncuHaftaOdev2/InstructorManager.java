package ucuncuHaftaOdev2;

public class InstructorManager extends UserManager {

	@Override
	public void add(User user) {
		System.out.println("Sisteme eklenen eðitmenin ismi: "+user.getName());
	}

	@Override
	public void delete(User user) {
		System.out.println("Sistemden silinen eðitmenin ismi: "+user.getName());
	}

	@Override
	public void update(User user) {
		System.out.println(user.getName()+" adlý eðitmen sistemde güncellendi...");
	}

	@Override
	public void logIn(User user) {
		System.out.println("Sisteme giriþ yapan eðitmenin ismi: "+user.getName());
	}

	@Override
	public void logOut(User user) {
		System.out.println("Sistemden çýkýþ yapan eðitmenin ismi: "+user.getName());
	}
	

}
