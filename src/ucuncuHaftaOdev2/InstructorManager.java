package ucuncuHaftaOdev2;

public class InstructorManager extends UserManager {

	@Override
	public void add(User user) {
		System.out.println("Sisteme eklenen e�itmenin ismi: "+user.getName());
	}

	@Override
	public void delete(User user) {
		System.out.println("Sistemden silinen e�itmenin ismi: "+user.getName());
	}

	@Override
	public void update(User user) {
		System.out.println(user.getName()+" adl� e�itmen sistemde g�ncellendi...");
	}

	@Override
	public void logIn(User user) {
		System.out.println("Sisteme giri� yapan e�itmenin ismi: "+user.getName());
	}

	@Override
	public void logOut(User user) {
		System.out.println("Sistemden ��k�� yapan e�itmenin ismi: "+user.getName());
	}
	

}
