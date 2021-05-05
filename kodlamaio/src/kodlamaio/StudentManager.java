package kodlamaio;

public class StudentManager extends UserManager{
	public void Add(Student student) {
		System.out.println(student.getFirstName()+student.getLastName()+" adlı öğrenci eklendi");
	}
	
	public void Delete(Student student) {
		System.out.println(student.getFirstName()+student.getLastName()+" adlı öğrenci silindi");
	}
	
	public void Update(Student student) {
		System.out.println(student.getFirstName()+student.getLastName()+" adlı öğrenci güncellendi");
	}
}
