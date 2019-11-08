package Assignment;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		StudentDatabase stu1= new StudentDatabase("Tom","873025720395");
		stu1.setUserId();
		System.out.println(stu1.getUserId());
	}

}
