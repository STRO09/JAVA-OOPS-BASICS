package queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Main {
public static void main(String[] args) {

	PriorityQueue<String> songname = new PriorityQueue<String>();
	songname.add("MAAD city");
	songname.add("Heartbreak kid");
	
	songname.add("Life goes on");
	songname.add("Not alike");
	songname.add("She knows");
	System.out.println(songname.contains("She knows not"));
	System.out.println(songname.contains("She knows"));
	
	Iterator<String> iterator = songname.iterator();
	while (iterator.hasNext()) {
		String song = (String) iterator.next();
		System.out.println(song);
		
	}
	songname.remove("Life goes on");
	System.out.println(songname.poll());
	System.out.println(songname.peek());
	songname.clear();
	
	Iterator<String> iterator2 = songname.iterator();
	while (iterator2.hasNext()) {
		String song = (String) iterator2.next();
		System.out.println(song);
	}
	if(iterator2.hasNext() == false) {
		System.out.println("No songs");
	}
}
}
