package kodlamaio;

public class InstructorManager extends Instructor{
	public void Add(InstructorManager instructor) {
		System.out.println(instructor.firstName+" "+instructor.getLastName()+" isimli eğitmen eklendi");
	}
	public void Delete(InstructorManager instructor) {
		System.out.println(instructor.firstName+" "+instructor.getLastName()+" isimli eğitmen silindi");
	}
	public void Uptade(InstructorManager instructor) {
		System.out.println(instructor.firstName+" "+instructor.getLastName()+" isimli eğitmen guncellendi");
	}
}
