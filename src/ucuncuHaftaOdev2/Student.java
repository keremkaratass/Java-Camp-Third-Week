package ucuncuHaftaOdev2;

public class Student extends User {
	private String communicationMessage;
	private String address;
	public Student(int id, String name, String surname, String eMail, String password, String communicationMessage,
			String address) {
		super(id, name, surname, eMail, password);
		this.communicationMessage = communicationMessage;
		this.address = address;
		
	}
	public String getCommunicationMessage() {
		return communicationMessage;
	}
	public void setCommunicationMessage(String communicationMessage) {
		this.communicationMessage = communicationMessage;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}
