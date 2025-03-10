package hashmap_;

public class Emp {

	private String empname;
	private int empid;

	public Emp(String empname, int empid) {
		super();
		this.empname = empname;
		this.empid = empid;
	}

	@Override
	public String toString() {
		return "Emp [empname=" + empname + ", empid=" + empid + "]";
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

}
