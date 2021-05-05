package kodlamaio;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.setUserId(1);
		student.setFirstName("Zehra");
		student.setLastName("Saraç");
		student.setEmail("zehrassarac@gmail.com");
		
		Instructor instructor = new Instructor();
		instructor.setId(2);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setEmail("engindemirog@gmail.com");
		
		System.out.println(student.firstName);
		System.out.println(instructor.firstName);
		
	}

}
