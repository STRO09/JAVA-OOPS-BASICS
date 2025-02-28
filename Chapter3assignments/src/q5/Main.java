package q5;

class Employee {
    private String empName; 
    private static String companyName = "TechCorp";

    public Employee(String empName) {
        this.empName = empName;
    }

    public void showSalary() {
        double salary = 50000.0; // Local Variable (exists only inside this method)
        System.out.println(empName + "'s Salary: $" + salary);
    }

    public static String getCompanyName() { // Static Method
        return companyName;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice");
        emp1.showSalary(); // Uses local & global variables

        System.out.println("Company Name: " + Employee.getCompanyName()); // Uses static variable
    }
}

