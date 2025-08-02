package getclass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Emp {
	
	private static String cname = "Stro corps";
	public String empname;
	public double salary;
	int empid;
	
	 void getId() {
		// TODO Auto-generated method stub
		 System.out.println("Emp id: "+ this.empid);
	}
	 
	static void getCompanyName() {
		// TODO Auto-generated method stub
		System.out.println("Company name: "+ Emp.cname);
	}

	public Emp(String empname, int empid, double sal) {
		super();
		this.empname = empname;
		this.empid = empid;
		this.salary = sal;
	}
}

class Worker {
	private Worker() {
		// TODO Auto-generated constructor stub
		System.out.println("worker");
	}
}

public class Main {
public static void main(String[] args) {

	Emp emp = new Emp("Sagar", 54, 55000); 
	
	System.out.println("Class name: ");
	System.out.println(emp.getClass().getName());
	Field fields[] = emp.getClass().getDeclaredFields();
	Field fields2[] = emp.getClass().getFields();
	
	System.out.println("Declared Fields:");
	for(Field field: fields) {
		System.out.println(field);
	}
	
	System.out.println("Fields:");
	for(Field field: fields2) {
		System.out.println(field);
	}
	
	Method methods[] = emp.getClass().getMethods();
	Method methods2[] = emp.getClass().getDeclaredMethods();
	
	System.out.println("Methods:");
	for(Method method: methods)
	{
		System.out.println(method);
	}
	
	System.out.println("Declared Methods:");
	for(Method method: methods2)
	{
		System.out.println(method);
	}
	
	@SuppressWarnings("unchecked")
	Constructor<Emp>[] constructors = (Constructor<Emp>[]) emp.getClass().getConstructors();
	
	for(Constructor<Emp> constructor:constructors)
	{
		System.out.println(constructor);
	}
	
	
	
	
	
}
}
