package properties;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class OpsImp implements Operations {

	Properties countrycapitals = new Properties();



	@Override
	public void updateData(String country, String capital) {

		int flag =0;
		Set<Object> countries = countrycapitals.keySet();
		Iterator<Object> iterator = countries.iterator();
		while (iterator.hasNext()) {
			if(iterator.next() ==country) {
				System.out.println("Found the country!");
//				String country = (String) iterator.next();
				countrycapitals.replace(country, capital);
				System.out.println("Data Updated successfully!");
				flag =1;
			}
			}
		if (flag ==0) {
			System.out.println("No such data found...");
		}
		

	}

	@Override
	public void searchData(String country1) {
	
		int flag =0;
		Set<Object> countries = countrycapitals.keySet();
		Iterator<Object> iterator = countries.iterator();
		System.out.println("Country and their Capitals: ");
		while (iterator.hasNext()) {
			if(iterator.next() ==country1) {
				System.out.println("Found the country!");
//				String country = (String) iterator.next();
				System.out.println(country1+" : "+countrycapitals.getProperty(country1));
				flag =1;
			}
			}
		if (flag ==0) {
			System.out.println("No such data found...");
		}
		

	}

	@Override
	public void showData() {
		// TODO Auto-generated method stub
		Set<Object> countries = countrycapitals.keySet();
		Iterator<Object> iterator = countries.iterator();
		System.out.println("Country and their Capitals: ");
		while (iterator.hasNext()) {
			String country = (String) iterator.next(); 
			System.out.println(country+" : "+countrycapitals.getProperty(country));
		}
		
	}

	@Override
	public void insertData(String country, String capital) {
		// TODO Auto-generated method stub
		
		countrycapitals.put(country, capital);
		System.out.println("Data Inserted Successfully");
		
	}

	@Override
	public void deleteData(String country) {
		// TODO Auto-generated method stub
		int flag = 0 ;
		Set<Object> countries = countrycapitals.keySet();
		Iterator<Object> iterator = countries.iterator();
		while (iterator.hasNext()) {
			if (iterator.next() == country ) {
				iterator.remove();
				System.out.println("***Data Deleted***");
				flag =1;
			}
//			countrycapitals.remove(country);
			if (flag ==0) {
				System.out.println("No such data found...");
			}
		
		}
		
		
		
	}

}
