package tostring;
class Emp {
		
	String empname; 
	int empid;
	public Emp(String empname, int empid) {
		super();
		this.empname = empname;
		this.empid = empid;
	}
	@Override
	public String toString() {
		return "Emp [empname=" + empname + ", empid=" + empid + "]";
	} 
		
}


public class Main {
public static void main(String[] args) {
	
	Emp emp = new Emp("Sagar", 54);
	System.out.println(emp);
}
}
