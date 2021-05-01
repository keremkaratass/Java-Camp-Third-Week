package ucuncuHaftaOdev2;

public class Main {

	public static void main(String[] args) {
		Student student=new Student(1, "Kerem", "Karatas", "example@gmail.com", "111", "Java prog dili", "examp mah.no:3");
		Instructor instructor=new Instructor(1, "Engin", "Demirog", "examp2@gmail.com", "123", 3, "java123");
		
		UserManager userManager=new StudentManager();
		userManager.add(student);
		userManager.delete(student);
		userManager.update(student);
		userManager.logIn(student);
		userManager.logOut(student);
		
		
		UserManager userManager2=new InstructorManager();
		userManager2.add(instructor);
		userManager2.delete(instructor);
		userManager2.update(instructor);
		userManager2.logIn(instructor);
		userManager2.logOut(instructor);
		
		
		
		
	}

}
