package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
public static void main(String[] args) {
	ArrayList<Employees> arrayList = new ArrayList<Employees>();
	arrayList.add(new Employees("Sagar", 54));
	arrayList.add(new Employees("Rajan", 39));
	arrayList.add(new Employees("Sonu", 53));
	arrayList.add(new Employees("Aditri", 55));
	
	Collections.sort(arrayList);
	
	System.out.println("EMployees in order: ");
	for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
		Employees employee = (Employees) iterator.next();
		System.out.println(employee);
	}
}
}
