package com.hospital.staff.doctor.salary;

public class Salary {

	protected void calculateSalary(double amt, double tax) {
		// TODO Auto-generated method stub
		System.out.println(amt-tax);

	}
	
	
	public static void main(String[] args) {
		
		Salary salary = new Salary();
		salary.calculateSalary(50000, 500);
		
	}
}
