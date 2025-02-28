package cloning;

import java.util.Objects;

class Emp implements Cloneable{
	String empname;
	int empid;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
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

	public Emp() {
		super();

	}
	
}



public class Main {
public static void main(String[] args) {

	Emp emp = new Emp();
	Emp emp2 = new Emp();
	 try {
		emp2= (Emp) emp.clone();
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 System.out.println(emp.hashCode());
	 System.out.println(emp2.hashCode());
	 System.out.println(emp2.equals(emp));
	 System.out.println(emp.equals(emp2));
}
}
