package set;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {
	public static void main(String[] args) {

		TreeSet<String> emps = new TreeSet<String>();

		System.out.println(emps.isEmpty());
		emps.add("Sagar");
		emps.add("Prajwal");
		emps.add("Sonu");
		emps.add("Aditri");

		emps.addFirst("First employee");
		emps.addLast("Last emp");
		System.out.println(emps.contains("Rajan"));

		System.out.println(emps.first());

		emps.remove("Aditri");
		
		Iterator iterator = emps.iterator();
		System.out.println("Employees: ");
		while (iterator.hasNext()) {
			String emp = (String) iterator.next();
			System.out.println(emp);
			
		}
	}
}
