package q6import;

import com.hospital.staff.doctor.salary.Salary;

class Emp extends Salary{
	@Override
	protected void calculateSalary(double amt, double tax) {
		// TODO Auto-generated method stub
		super.calculateSalary(amt, tax);
	}
}

public class Main{

	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.calculateSalary(50000, 5000);
	}
}
