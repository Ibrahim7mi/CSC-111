
public class Employee {
	private double salary;
	private String department;
	private int years;
	private Employee manager;

	public Employee() {

	}

	public Employee(double salarry, String department, Employee manager) {
		this.salary = salary;
		this.department = department;
		this.manager = manager;
	}

	public double getSalary() {
		return salary;
	}

	public String getDepartment() {
		return department;
	}

	public Employee getManager() {
		return manager;
	}

	public boolean isManager() {
		if (this.manager == null)
			return true;
		return false;
	}

	public boolean isManagerValid(Employee manager) {
		if (manager == null)
			return false;
		if (this.department.equalsIgnoreCase(manager.department) && manager.manager == null)
			return true;
		else
			return false;
	}

	public boolean changeManager(Employee newManager) {
		if (isManagerValid(newManager)) {
			this.manager = newManager;
			System.out.println("Manager has been changed correctly");
			return true;
		}
		System.out.println("Manager couldn't be changed");
		return false;

	}
	public boolean yearlyRaise(double performance) {
		if(performance < 0 || performance > 100)
			return false;
		if(performance >= 90 && performance <= 100) {
			salary = salary*1.15;
			
		}
		else if(performance >= 75 && performance < 90) {
			salary = salary*1.10;
		
		}
		else if(performance >= 50 && performance < 75) {
			salary = salary*1.05;
			
		}
		else if(performance >= 25 && performance < 50) {
		
		}
		else if(performance < 25) {
			salary = salary*0.95;
			
		}
		if(years >= 0 && years <= 5) {
			salary = salary + 100;
			
		}
		else if(years >= 6 && years <= 10) {
			salary = salary + 250;
			
		}
		else if(years >= 11) {
			salary = salary + 500;
		}
		years++;
		if(this.manager != null)
			manager.salary += 1000;
		
		return true;
		
	}
	public String toString() {
		String t = "";
		
		if(this.manager == null) {
			t += "Manager of " + this.department + " department. Worked for "+ this.years + " years. Salary: " + this.salary;
		}
		else 
			t += "Employee in " + this.department + " department. Worked for "+ this.years + " years. Salary: " + this.salary;
		return t;
	}
	
	

}
