package iteration;

import java.util.HashSet;


public class Foreach {
public static void main(String[] args) {
	HashSet<String> emps = new HashSet<String>();
	
	emps.add("Sagar");
	emps.add("Prajwal");
	emps.add("Sonu");
	emps.add("Aditri");
	
	for (String set: emps) {
		System.out.println(set);
	}
}
}
