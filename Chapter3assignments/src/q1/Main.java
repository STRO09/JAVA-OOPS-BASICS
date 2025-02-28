package q1;

class Employee {
    private static String companyName = "StroCorp"; 


    public static String getCompanyName() { 
        return companyName;
    }
}

public class Main {
public static void main(String[] args) {

	 System.out.println("Company Name: " + Employee.getCompanyName());
}
}
