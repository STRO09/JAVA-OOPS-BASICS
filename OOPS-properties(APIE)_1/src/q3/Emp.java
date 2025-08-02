package q3;


public class Emp extends Company {
	private double salary; 
	public String name; 


	public Emp(String name, double salary) {
	        this.name = name;
	        this.salary = salary;
	    }

    private double getSalary() {
        return salary;
    }
	    
    public void displayEmployeeDetails() {
	    System.out.println("Company Name: "+ cname);
	    System.out.println("Company Department: " + dept); 
	    System.out.println("Employee Name: " + name);
	    System.out.println("Salary: " + getSalary()); 
	    }


}

