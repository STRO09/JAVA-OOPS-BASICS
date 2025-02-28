package vector;

import java.util.Iterator;
import java.util.Vector;

public class Main {
public static void main(String[] args) {
	Vector<String> strings = new Vector<String>();
	strings.add("first");
	strings.add("second");
	strings.add("third");
	System.out.println(strings);
	
	strings.remove(1);
	System.out.println(strings);
	
	
	strings.add("fourth");
	
	Iterator<String> iterator = strings.iterator();
	while (iterator.hasNext()) {
		String s = (String) iterator.next();
		System.out.println(s);
	}
System.out.println(strings.contains("second"));
System.out.println(strings.contains("first"));
	
}
}
