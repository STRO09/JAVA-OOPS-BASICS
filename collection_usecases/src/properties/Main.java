package properties;

public class Main {

	public static void main(String[] args) {
				
		OpsImp imp = new OpsImp();
		imp.insertData("India", "Delhi");
		imp.insertData("China", "Beijing");
		imp.insertData("Japan","Tokyo");
		imp.insertData("USA", "Washington");
		imp.showData();
		imp.deleteData("USA");

		imp.showData();
		imp.searchData("Japan");
////
		imp.updateData("India","Mumbai");
//		
		imp.showData();
		

	}

}
