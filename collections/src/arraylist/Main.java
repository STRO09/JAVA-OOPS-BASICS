package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
public static void main(String[] args) {
	
	ArrayList<Integer> arraylist = new ArrayList<Integer>();
	arraylist.add(54);
	arraylist.add(45);
	arraylist.add(13);
	arraylist.add(61);
	System.out.println(arraylist);
	arraylist.remove(0);
	System.out.println(arraylist);
	
	Iterator<Integer> iterator = arraylist.iterator();
    while (iterator.hasNext()) {
    	Integer i = (Integer) iterator.next();
    	System.out.println(i);
}
    System.out.println(arraylist.contains(54));

	
	
}
}
