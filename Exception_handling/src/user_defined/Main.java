package user_defined;

@SuppressWarnings("serial")
class Myexception extends Exception {
public Myexception() {
	// TODO Auto-generated constructor stub
	System.out.println("Nah boy get out");
}
}

public class Main {

	public static void blockaccess(int age) throws Myexception {
		// TODO Auto-generated method stub
		if(age<18) {
			throw new Myexception();
		}
		else {
			System.out.println("You have successfully entered the site!");
		}
		

	}
	
public static void main(String[] args) {
	int age = 16;
	
	try {
		blockaccess(age);
	} catch (Myexception e) {
		// TODO: handle exception
		
	}
}
}
