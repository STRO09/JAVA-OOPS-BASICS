package multicatch;

public class Main {
public static void main(String[] args) {
	try {
		int a = 10/20;
		String b = "HEllo";
		b= null;
		System.out.println(b.length());
		
		
	} catch (ArithmeticException e) {
		// TODO: handle exception
		System.out.println(e);
	}
	catch (NullPointerException e) {
		// TODO: handle exception
		System.out.println(e);
	}
}
}
