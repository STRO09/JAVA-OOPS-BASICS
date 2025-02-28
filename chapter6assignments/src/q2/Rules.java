package q2;

public abstract class Rules implements Company {

	@Override
	public abstract void salary(double salary) ;

	@Override
	public abstract void workhrs();
	
	@Override
	public abstract void breaktime();
	
	@Override
	public void casualbreak() {
		System.out.println("Anytime");
		
	}
	
}
