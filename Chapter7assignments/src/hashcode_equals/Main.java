package hashcode_equals;

import java.util.Objects;

class Emp {
	public int empid;
	public String empname;
	
	public Emp(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	} 
	
	@Override
	public int hashCode() {
		return Objects.hash(empid, empname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return empid == other.empid && Objects.equals(empname, other.empname);
	}

}

public class Main {
public static void main(String[] args) {
	Emp emp = new Emp(54, "sagar");
	Emp emp2 = new Emp(39, "Rajan");
	System.out.println(emp);
	System.out.println(emp.equals(emp2));
	
	
}
}
