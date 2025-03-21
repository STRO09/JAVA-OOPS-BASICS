package linkedlist;


import java.util.Iterator;
import java.util.LinkedList;


public class OpsImp implements Operations {

	LinkedList<Emp> emps = new LinkedList<Emp>();

	@Override
	public void deleteData(int id) {
		// TODO Auto-generated method stub
		Iterator<Emp> iterator = emps.iterator();
		while (iterator.hasNext()) {
			Emp emp = (Emp) iterator.next();
			if (emp.getEmpid() == id) {
				iterator.remove();
				System.out.println("Data deleted successfully...");
			}
		}

	}

	@Override
	public void updateData(int id, String name) {
		// TODO Auto-generated method stub
		Iterator<Emp> iterator = emps.iterator();
		while (iterator.hasNext()) {
			Emp emp = (Emp) iterator.next();
			if(emp.getEmpid()==id) {
				emp.setEmpname(name);
				System.out.println("Data updated successfully");
			}
			
		}

	}

	@Override
	public void searchData(int id) {
		// TODO Auto-generated method stub
		Iterator<Emp> iterator = emps.iterator();
		while (iterator.hasNext()) {
			Emp emp = (Emp) iterator.next();
			if (emp.getEmpid() == id) {
				System.out.println("Found the employee! :");
				System.out.println(emp);
			}

		}

	}

	@Override
	public void showData() {
		// TODO Auto-generated method stub
		Iterator<Emp> iterator = emps.iterator();
		System.out.println("Here is each employees' data: ");
		while (iterator.hasNext()) {
			Emp emp = (Emp) iterator.next();
			System.out.println(emp);

		}

	}

	@Override
	public void insertDataAtHead(Emp emp) {
		// TODO Auto-generated method stub
		emps.addFirst(emp);
		System.out.println("Data inserted at first index successfully!");
		
	}

	@Override
	public void insertDataAtTail(Emp emp) {
		// TODO Auto-generated method stub
		//emps.addLast(emp);
		emps.add(emp);
		System.out.println("Data inserted in the end successfully!");
 
	}

	@Override
	public void insertData(int position, Emp emp) {
		// TODO Auto-generated method stub
		emps.add(position, emp);
		System.out.println("Data inserted at position "+ position + " successfully");
		
	}

}
