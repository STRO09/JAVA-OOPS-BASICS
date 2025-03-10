package iteration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Iterator_main {
	public static void main(String[] args) {
		ArrayList<String> languages = new ArrayList<String>(Arrays.asList("Java", "Python", "MYSQL", "HTML", "CSS"));

		Iterator<String> iterator = languages.iterator();
		
		System.out.println("Programming languages: ");
		while (iterator.hasNext()) {
			String language = (String) iterator.next();
			if(language=="Python") {
				iterator.remove();
			}
			System.out.println(language);
		}
		
		iterator = languages.iterator();
		System.out.println("Programming languages after deletion: ");
		while (iterator.hasNext()) {
			String language = (String) iterator.next();
			System.out.println(language);
		}
	}
}
