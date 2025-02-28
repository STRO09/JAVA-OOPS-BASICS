package q5;

class Manager{
	String work= "A lot";

	
	public Manager() {
		System.out.println("I work a lot");
	}
	
	void getCname() {
		System.out.println("Stro corps");
	}
	
	
	
}


class Employee extends Manager {
	
	public Employee() {
		// TODO Auto-generated constructor stub
		super();
	}
	 void getwork() {
		// TODO Auto-generated method stub
		 
		 System.out.println(super.work);
		 

	}
	 void getcname() {
		// TODO Auto-generated method stub

		 super.getCname();
	}
}
public class Main {
public static void main(String[] args) {
	Employee  employee = new Employee();
	employee.getCname();
	employee.getwork();
	
}
}
