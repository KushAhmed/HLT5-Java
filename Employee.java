
public class Employee {

	// variables - attribute
	int eid;
	String ename;
	double salary;
	String email;
	String department;

	// methods
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
		
	public static void main(String[] args) {
		
		// create object of class Employee
		Employee e1 = new Employee(); // creating object using constructor

		//using set method setting Employee's attribute
		e1.setEid(101);
		e1.setEname("Billy");
		e1.setSalary(35000.99);
		e1.setEmail("billy@email.com");
		e1.setDepartment("IT");
				
		System.out.println("Employee Information");
		System.out.println("=================");

		// Display Employee information using String -> e1
		System.out.println("Employee  ID : "+e1.getEid());
		System.out.println("Employee  Name : "+e1.getEname());
		System.out.println("Employee Salary : "+e1.getSalary());
		System.out.println("Employee  Email : "+e1.getEmail());
		System.out.println("Employee  Department : "+e1.getDepartment());
	}

}
