package q2;

class Person{
	String name;
	static String species= "Human";
	 void displayName(String name) {
		// TODO Auto-generated method stub
		System.out.println(name);

	}
	
	void displaySpecies() {
		// TODO Auto-generated method stub
		System.out.println(species);

	}
	
	
}


public class Mian {

	public static void main(String[] args) {
		Person person = new Person();
		person.displayName("Sagar");
		person.displaySpecies();
		
	}
}
