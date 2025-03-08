package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		ArrayList<Employees> arrayList = new ArrayList<Employees>();
		arrayList.add(new Employees("Sagar", 54, 540000));
		arrayList.add(new Employees("Rajan", 39, 390000));
		arrayList.add(new Employees("Sonu", 53, 5300));
		arrayList.add(new Employees("Aditri", 55, 5500));

		Collections.sort(arrayList, new Idcomparator());
		
		System.out.println("Employees in order of empid (Ascending): ");
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			Employees employee = (Employees) iterator.next();
			System.out.println(employee);
		}
		
		Collections.sort(arrayList, new SalaryComparator());

		System.out.println("Employees in order of Salary (Descending): ");
		for (Iterator iterator = arrayList.iterator(); iterator.hasNext();) {
			Employees employee = (Employees) iterator.next();
			System.out.println(employee);
		}
	}
}
