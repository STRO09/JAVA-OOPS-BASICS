package static_innerclass;

import static_innerclass.Emp.EmpPersonalDetails;

class Emp{
	int empid;
	static String cname = "Stro corps";
	
	
	static class EmpPersonalDetails{
		
//		void acessNonstaticData() {
//			// TODO Auto-generated method stub
//			System.out.println(empid);
//		}
		
		 void accessStaticData() {
			// TODO Auto-generated method stub
			 System.out.println(cname);
		}
		 
		 static void accessStaticData2() {
			// TODO Auto-generated method stub
			 System.out.println(cname);
		}
}

	
}

public class Main {
public static void main(String[] args) {
	Emp.EmpPersonalDetails details = new Emp.EmpPersonalDetails();
	details.accessStaticData();
//	details.acessNonstaticData();
	Emp.EmpPersonalDetails.accessStaticData2();
	EmpPersonalDetails.accessStaticData2();

}
}
