package q2;

class Disconnectedobj {
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Object ready for deletion...");
	}
}

public class Main {
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		Disconnectedobj disconnectedobj = new Disconnectedobj();
		disconnectedobj = null;
		System.gc();
		
	}
}