package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Main {
public static void main(String[] args) {
	
	HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
	hashMap.put(54, "sagar");
	hashMap.put(39, "rajan");
	hashMap.put(53, "Sonu");
	hashMap.put(31, "Randomm");
	hashMap.remove(31);
	
	Set<Entry<Integer, String>> set = hashMap.entrySet();
	Iterator<Entry<Integer, String>> iterator = set.iterator();
	
	while (iterator.hasNext()) {
		Object object = (Object) iterator.next();
		System.out.println(object);
	}
	
}
}
