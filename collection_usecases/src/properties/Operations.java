package properties;


public interface Operations {

	void insertData(String country, String capital);

	void deleteData(String country);

	void updateData(String country, String capital);

	void showData();

	void searchData(String country);
}
