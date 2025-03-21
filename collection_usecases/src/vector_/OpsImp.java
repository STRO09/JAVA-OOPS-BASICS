package vector_;

import java.util.Iterator;
import java.util.Vector;

public class OpsImp implements Operations {

	Vector<Emp> emps = new Vector<Emp>();

	@Override
	public void insertData(Emp emp) {
		// TODO Auto-generated method stub
		emps.add(emp);
		System.out.println("Data inserted successfully!");

	}

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

}
