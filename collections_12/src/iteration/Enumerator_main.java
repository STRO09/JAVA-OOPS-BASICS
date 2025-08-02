package iteration;

import java.util.Enumeration;

import java.util.Vector;

public class Enumerator_main {
public static void main(String[] args) {
	Vector<String> emps = new Vector<String>();
	
	emps.add("Sagar");
	emps.add("Prajwal");
	emps.add("Sonu");
	emps.add("Aditri");
	
	Enumeration<String> emp;
	
	emp = emps.elements();
	System.out.println("Iteration with enumerator: ");
	while (emp.hasMoreElements()) {
		String employee = (String) emp.nextElement();
		System.out.println(employee);
	}
	
}
}
