package try_catch;

public class Main {
public static void main(String[] args) {
	
	try{
		int a = 10/0;
	}
	catch(ArithmeticException arithmeticException) {
		
		System.out.println(arithmeticException);
	}
	
	
}
}
