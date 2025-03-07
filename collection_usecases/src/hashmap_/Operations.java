package hashmap_;

import java.util.HashMap;

public interface Operations {

	void insertData(HashMap<Integer, String> empdata);

	void deleteData(int empid);

	void updateData(int empid, String name);

	void showData();

	void searchData(int id);
}
