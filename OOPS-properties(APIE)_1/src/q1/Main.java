package q1;

class Emp {

	String name ; 
	int id ; 
	double sal;
	String address; 
	


	void displayinfo() {
		// TODO Auto-generated method stub

		System.out.println("Name: "+name+".Sal: "+sal+". Address: "+address);
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", sal=" + sal + ", address=" + address + "]";
	}
}



public class Main {
	public static void main(String[] args) {
		
		
		Emp emp = new Emp();
		emp.displayinfo();
		System.out.println(emp);
	}

}
