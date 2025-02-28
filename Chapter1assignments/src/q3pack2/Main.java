package q3pack2;

import q3.Emp;
import q3.Manager;

public class Main {
public static void main(String[] args) {
	Emp emp = new Emp("Yuvi", 50000);
	emp.displayEmployeeDetails();
	//emp.getSalary();
	
	Manager manager = new Manager();
	manager.getCname();
	
}
}
