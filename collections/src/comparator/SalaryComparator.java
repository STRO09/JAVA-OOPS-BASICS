package comparator;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employees>{
@Override
public int compare(Employees o1, Employees o2) {
	// TODO Auto-generated method stub
	
	if (o1.getSalary()<o2.getSalary()) {
		return 1;
	}
	else if (o1.getSalary()>o2.getSalary()) {
		return -1;
	}
	else {
		return 0;
		
	}
	
}
}
