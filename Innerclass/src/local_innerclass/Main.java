package local_innerclass;

class Emp{
	 int empid;	
	 private double salary;
	 public Emp(int empid, double salary) {
		super();
		this.empid = empid;
		this.salary = salary;
	}
	void getDetails() {
		// TODO Auto-generated method stub
		 class EmpPersonalDetails{

			 String empname;
			 String address;
			 public EmpPersonalDetails(String empname, String address) {
				super();
				this.empname = empname;
				this.address = address;
			}

			  void getallDetails() {
				// TODO Auto-generated method stub
				  System.out.println("Employee Name: "+empname+", Id: "+empid+", Salary: "+salary+", Address: "+address);

			}
			 
		 }
		 EmpPersonalDetails details = new EmpPersonalDetails("Sagar", "Andheri");
		 details.getallDetails();
		 
	}
	
	
}

public class Main {
public static void main(String[] args) {
	Emp emp = new Emp(54, 21500);
	emp.getDetails();
}
}
