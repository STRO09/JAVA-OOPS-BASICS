package anonnymousasparameter;

class Address {
	String cityname; 
	String landamrk;
	public Address(String cityname, String landamrk) {
		super();
		this.cityname = cityname;
		this.landamrk = landamrk;
		
	}
	 void getAddress() {
		// TODO Auto-generated method stub
		 System.out.println("Cityname: "+cityname+" Landmark: "+landamrk);
	}
	
}


class Hobbies {
	String h1; 
	String h2;
	public Hobbies(String h1, String h2) {
		super();
		this.h1 = h1;
		this.h2 = h2;
	}
	
	void getHobbies() {
		// TODO Auto-generated method stub
		System.out.println("HObby 1: "+h1+" Hobby 2: "+h2);
	}
	
}


class Emp {
	
	String empname; 
	int empid;

	public Emp(String empname, int empid) {
		super();
		this.empname = empname;
		this.empid = empid;
	} 
	 void showEmp() {
		// TODO Auto-generated method stub
		 System.out.println("Emp name: "+empname+"Emp ID: "+empid);
		 
	}

	
}

class EmpInfo {
	 void showEmpInfo(Address address, Hobbies hobbies, Emp emp) {
		// TODO Auto-generated method stub
		 address.getAddress();
		 hobbies.getHobbies();
		 emp.showEmp();
	}
}



public class Main {
public static void main(String[] args) {
	
	EmpInfo empInfo = new EmpInfo();
	empInfo.showEmpInfo(new Address("Mumbai", "Bhavans College"), new Hobbies("Mangas", "Writing"), new Emp("Sagar", 54));
	
}
}
