package ucuncuHaftaOdev2;

public class User {
	private int id;
	private String name;
	private String surname;
	private String eMail;
	private String password;
	public User(int id, String name, String surname, String eMail, String password) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.eMail = eMail;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String geteMail() {
		return eMail;
	}
	public String getPassword() {
		return password;
	}
	

}
