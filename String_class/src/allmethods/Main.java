package allmethods;



public class Main {
public static void main(String[] args) {

	String a = "Hello Sagar how you been BOY";
	
	System.out.println(a.length());
	
	System.out.println(a.compareTo("Hello Rajan how you been BOY"));
	

	String b = "Hi";
	System.out.println(b.compareTo("Bye"));
	
	System.out.println(a.concat(".Fine?"));
	
	String c = "         Nehhhh......    maybe.  ";
	System.out.println(c.trim());
	
	System.out.println(a.replace("e", "o"));
	
	String ab = String.valueOf(56.67);
	
	System.out.println(ab);
	
	String ac = "59";
	
	Integer ad = Integer.parseInt(ac);
	System.out.println(ad);
}


}
