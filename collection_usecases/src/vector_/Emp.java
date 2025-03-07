package vector_;

public class Emp {

	private String empname;
	private int empid;
	private double salary;

	public Emp(String empname, int empid, double salary) {
		super();
		this.empname = empname;
		this.empid = empid;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [empname=" + empname + ", empid=" + empid + ", salary=" + salary + "]";
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
