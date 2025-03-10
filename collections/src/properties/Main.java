package properties;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Main {
public static void main(String[] args) {
	
	Properties properties = new Properties();
	properties.put("India", "Delhi");
	properties.put("Japan", "tokyo");
	properties.put("USA", "Wshington");
	
	System.out.println(properties.containsKey("USA"));
	System.out.println(properties.containsValue("Mumbai"));
	
	Set<Object> countries = properties.keySet();
	
	Iterator<Object> iterator = countries.iterator();
	System.out.println("COuntry and their capitals: ");
	while (iterator.hasNext()) {
		String country = (String) iterator.next();
		System.out.println(country+" : "+properties.getProperty(country));
		
	}
	
	properties.remove("USA");
	
	Iterator<Object> iterator2 = countries.iterator();
	System.out.println("COuntry and their capitals: ");
	while (iterator2.hasNext()) {
		String country = (String) iterator2.next();
		System.out.println(country+" : "+properties.getProperty(country));
		
	}
	
	properties.replace("India", "Mumbai");
	
	Iterator<Object> iterator3 = countries.iterator();
	System.out.println("COuntry and their capitals: ");
	while (iterator3.hasNext()) {
		String country = (String) iterator3.next();
		System.out.println(country+" : "+properties.getProperty(country));
		
	}
	
	
	
	
}
}
