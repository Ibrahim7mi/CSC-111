
public class TestStudent {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setStudName("Ahmed");
		s1.setStudAge(21);
		s1.setStudGPA(-4.75);
		
		System.out.print("Student Name:\t" + s1.getStudName()
				+ "\nStudent Age:\t" + s1.getStudAge()
				+ "\nStudent GPA:\t" + s1.getStudGPA());

	}

}
