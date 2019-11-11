package Assignment;

public class StudentDatabase implements ContactInfo{

	private String name;
	private String SSN;
	private String emailId;
	private static int ID = 1000;
	private String userId;
	
	public StudentDatabase(String name, String SSN){
		this.name = name;
		this.SSN = SSN;
		this.emailId = name + "@michael.com";
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId() {
		int random = (int)(Math.random()*1000);
		userId = ID + random + SSN.substring(SSN.length()-5, SSN.length());
	}
	public void enroll() {
		
	}
	public void pay() {
		
	}

	@Override
	public String toString() {
		return "Name :" + name +"SSN :" + SSN +"emailId :" + emailId + "UserID" + userId;
			
	}
	public void showCourse() {
		
	}

	@Override
	public String Contacts(String phone, String city, String state) {
		
		return "Phone:" + phone + "City:" + city + "State:" + state;
	}
	
}
