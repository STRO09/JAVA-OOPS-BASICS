package simple_innerclass;


class Emp{
	 int empid;	
	 private double salary;
	 public Emp(int empid, double salary) {
		super();
		this.empid = empid;
		this.salary = salary;
	}
	
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
	
	
}

public class Main {
public static void main(String[] args) {
	Emp emp = new Emp(54, 21500);
	Emp.EmpPersonalDetails empPersonalDetails = emp.new EmpPersonalDetails("Sagar", "Andheri");
	empPersonalDetails.getallDetails();
}
}
