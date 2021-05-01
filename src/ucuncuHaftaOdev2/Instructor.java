package ucuncuHaftaOdev2;

public class Instructor extends User {
	private int campNumber;
	private String courseCode;
	public Instructor(int id, String name, String surname, String eMail, String password, int campNumber,
			String courseCode) {
		super(id, name, surname, eMail, password);
		this.campNumber = campNumber;
		this.courseCode = courseCode;
		
	}
	public int getCampNumber() {
		return campNumber;
	}
	public void setCampNumber(int campNumber) {
		this.campNumber = campNumber;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	

}
