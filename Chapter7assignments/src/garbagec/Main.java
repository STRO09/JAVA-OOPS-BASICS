package garbagec;


class Emp {

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Object about to be deleted....");
	}

}

public class Main {
public static void main(String[] args) {
	Emp emp = new Emp() ;
	emp = null;

	System.gc();

}
}
