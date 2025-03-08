package linkedlist;

public class Main {

	public static void main(String[] args) {

		Emp emp = new Emp("Sagar", 54);
		Emp emp1 = new Emp("prajwal", 53);
		Emp emp2 = new Emp("Rajan", 39);
		Emp emp3 = new Emp("kendrick", 101);
		Emp emp4 = new Emp("Yuvi", 67);

		OpsImp imp = new OpsImp();

		
		imp.insertDataAtHead(emp);
		imp.insertDataAtTail(emp1);
		imp.showData();
		
		imp.insertData(1, emp3);
		
		imp.showData();
		
		imp.insertDataAtHead(emp2);
		imp.insertDataAtTail(emp4);
		
		imp.showData();
		
		imp.deleteData(101);
		imp.showData();
		
		imp.searchData(54);

		imp.updateData(54, "Janjoted");
		
		imp.showData();
		

	}

}
