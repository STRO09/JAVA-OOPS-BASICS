package hashmap_;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {

		HashMap<Integer, String> empdata = new HashMap<Integer, String>();
		
		empdata.put(54, "Sagar");
		empdata.put(39, "Rajan");
		empdata.put(7, "Krishnal");
		empdata.put(6, "Ishwari");
		OpsImp imp = new OpsImp();
		imp.insertData(empdata);
		imp.showData();
		imp.deleteData(53);
		imp.deleteData(54);
		imp.showData();
		imp.searchData(54);
		imp.searchData(7);
//
		imp.updateData(54, "Janjoted");
		
		imp.updateData(39,"Hari");
//		
		imp.showData();
		

	}

}
