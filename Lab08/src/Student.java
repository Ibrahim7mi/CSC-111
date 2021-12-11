
public class Student {

	private String studName;
	private int studAge;
	private double studGPA;

	public void setStudName(String name) {
		studName = name;
	}

	public void setStudAge(int age) {
		if (age > 0)
			studAge = age;
		else
			System.out.println("Error. Negative Age!");
	}

	public void setStudGPA(double gpa) {
		if (gpa > 0 && gpa <= 5)
			studGPA = gpa;
		else
			System.out.println("Error. Negative GPA!");
	}

	public String getStudName() {
		return studName;
	}

	public int getStudAge() {
		return studAge;
	}

	public double getStudGPA() {
		return studGPA;
	}

}
