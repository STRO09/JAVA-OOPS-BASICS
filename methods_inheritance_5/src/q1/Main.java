package q1;

final class Worker {}

//class AssistantWorker extends Worker {}

class Company {

	}
	


class Manager extends Company {
	
	final int projectgain = 5000;


	final void finalproject() {
		// TODO Auto-generated method stub
	 System.out.println("Final project");

	}
	
//	projectgain = 4000;
}

class Employee extends Manager {
	
	//@Override 
	//void finalproject() {
		// TODO Auto-generated method stub}
}


public class Main {
public static void main(String[] args) {
	
	Employee employee = new Employee();
	System.out.println(employee.projectgain);
	
	//employee.projectgain = 4000;
	employee.finalproject();
}
}
