package comparable;

public class Employees implements Comparable<Employees> {

	private String empname;
	private int empid;

	public Employees(String empname, int empid) {
		super();
		this.empname = empname;
		this.empid = empid;
	}

	@Override
	public String toString() {
		return "Employees [empname=" + empname + ", empid=" + empid + "]";
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

	@Override
	public int compareTo(Employees o) {
		// TODO Auto-generated method stub
		if(this.empid> o.empid) {
			return 1;
		}
		else if (this.empid< o.empid) {
			return -1;
		}
		else {
			return 0;
		}
	}

}
