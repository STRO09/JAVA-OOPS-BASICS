package q4;


class Accountant {
	
	void calSal(double salary) {
		// TODO Auto-generated method stub
		System.out.println(salary);
	}
	
	void calSal(double salary, double bonus) {
		// TODO Auto-generated method stub
		System.out.println(salary+bonus);
	}
	
	void calSal(double salary, double bonus, double tax){
		System.out.println(salary+bonus+tax);	
	}
}


class Manager extends Accountant {
	
}


class Employee extends Accountant{ 
	
}

class Worker extends Accountant{
	
}

public class Main {
public static void main(String[] args) {
	
	Manager manager = new Manager();
	Employee employee = new Employee();
	Worker worker = new Worker();
	
	manager.calSal(50000, 5000);
	
	employee.calSal(30000, 3000, 300);
	
	worker.calSal(10000);
	
}
}
