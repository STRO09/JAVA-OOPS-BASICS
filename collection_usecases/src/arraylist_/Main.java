package arraylist_;

public class Main {

	public static void main(String[] args) {

		Emp emp = new Emp("Sagar", 54, 30000);
		Emp emp1 = new Emp("prajwal", 53, 30000);
		Emp emp2 = new Emp("Rajan", 39, 30000);
		Emp emp3 = new Emp("kendrick", 101, 10000000);

		OpsImp imp = new OpsImp();
		imp.insertData(emp);
		imp.insertData(emp1);
		imp.insertData(emp2);
		imp.insertData(emp3);
		imp.showData();
		imp.deleteData(101);
		imp.showData();
		
		imp.searchData(54);

		imp.updateData(54, "Janjoted");
		
		imp.showData();
		

	}

}
