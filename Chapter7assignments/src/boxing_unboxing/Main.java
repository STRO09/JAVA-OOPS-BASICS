package boxing_unboxing;


public class Main {
public static void main(String[] args) {
	int a = 10;	
	Integer a2 = a;    //Autoboxing
	
	Float b = new Float(20.04f);
	float b2 = b;   //Autounboxing
	
	System.out.println(a2);
	System.out.println(a2.getClass().getName());
	System.out.println(b2);;
	
}

}
