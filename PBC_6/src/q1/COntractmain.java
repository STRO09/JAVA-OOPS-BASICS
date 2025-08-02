package q1;

class Emp implements Contract{

	@Override
	public void salary() {
		// TODO Auto-generated method stub
		System.out.println("20k");
		
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("9am-5pm");
	}}
public class COntractmain {
public static void main(String[] args) {
	Emp emp = new Emp();
	emp.salary();
	emp.work();
}
}
