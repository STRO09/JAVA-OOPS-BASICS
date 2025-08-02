package q1;


abstract class WorkPolicy {

	 void extrawork() {
		// TODO Auto-generated method stub
		 System.out.println("Extra work after workhours");
	}
	 
	abstract void workhours() ;
	abstract void salary();
}

class Employee extends WorkPolicy{

	@Override
	void workhours() {
		// TODO Auto-generated method stub
		System.out.println("9am-5pm");
		
	}

	@Override
	void salary() {
		// TODO Auto-generated method stub
		System.out.println("50k");
		
	}}

public class Abstractmain {
public static void main(String[] args) {
	Employee employee = new Employee();
	employee.extrawork();
	employee.salary();
}
}
