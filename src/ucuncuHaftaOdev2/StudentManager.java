package ucuncuHaftaOdev2;

public class StudentManager extends UserManager {

	@Override
	public void add(User user) {
		System.out.println("Sisteme eklenen ��rencinin ismi: "+user.getName());
	}

	@Override
	public void delete(User user) {
		System.out.println("Sistemden silinen ��rencinin ismi: "+user.getName());
	}

	@Override
	public void update(User user) {
		System.out.println(user.getName()+" adl� ��renci sistemde g�ncellendi...");
	}

	@Override
	public void logIn(User user) {
		System.out.println("Sisteme giri� yapan ��rencinin ismi: "+user.getName());
	}

	@Override
	public void logOut(User user) {
		System.out.println(user.getName()+" adl� ��renci sistemden ��k�� yapt�...");
		
	}
	

	
}
