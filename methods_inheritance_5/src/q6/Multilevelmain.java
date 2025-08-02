package q6;


class Ceo {
	
	 void Saltime() {
		// TODO Auto-generated method stub
		 System.out.println("Salary at the end of the month");

	}
}

class Maanger extends Ceo {}


class Employee extends Maanger {}

public class Multilevelmain {

	public static void main(String[] args) {
		
		Maanger maanger = new Maanger();
		maanger.Saltime();
		Employee employee = new Employee();
		employee.Saltime();
	}
}
