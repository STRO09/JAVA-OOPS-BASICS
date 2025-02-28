package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
public static void main(String[] args) {
	LinkedList<Integer> integers = new LinkedList<Integer>();
	integers.add(23);
	integers.add(25);
	integers.add(27);
	integers.add(30);
	
	System.out.println(integers);
	
	integers.remove();
	System.out.println(integers);
	integers.remove(1);
	System.out.println(integers);
	
	
	Iterator<Integer> iterator = integers.iterator();
	while (iterator.hasNext()) {
		Integer i = (Integer) iterator.next();
		System.out.println(i);
		
	}
	System.out.println(integers.contains(30));
	
	
}
}
