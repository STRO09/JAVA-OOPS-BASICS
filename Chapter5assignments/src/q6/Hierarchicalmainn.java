package q6;


class Company {
	 void cname() {
		// TODO Auto-generated method stub
		 System.out.println("Stro corps");
	}
}

class Emp extends Company{}

class Manager extends Company {}

public class Hierarchicalmainn {
public static void main(String[] args) {	
	
Emp emp = new Emp();
emp.cname();

Manager manager = new Manager();
manager.cname();

}
}
