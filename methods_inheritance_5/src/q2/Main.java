package q2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Parent {
	List<String> list = new ArrayList<String>();

	public List<String> getList() {
		list.add("Sagar");
		list.add("Prajwal");
		return list;
	}
}


class Child extends Parent {
	@Override
	public List<String> getList() {
		// TODO Auto-generated method stub
		LinkedList<String> list2 = new LinkedList<String>();
		list2.add("Rajan");
		list2.add("Hari");
		return list2;
	}
}

public class Main {
public static void main(String[] args) {
	Parent parent = new Parent();
	System.out.println(parent.getList());
	
	Child child = new Child();
	System.out.println(child.getList());
}
}
