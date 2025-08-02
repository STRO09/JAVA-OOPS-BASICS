package q3;

import java.util.Scanner;

abstract class Rbi{
	 abstract void roi(float roi) ;
}

class Sbi extends Rbi{
	
	@Override
	void roi(float roi) {
		// TODO Auto-generated method stub
		System.out.println("SBI Rate of Interest:"+ roi);
	}

	}

class Hdfc extends Rbi {

	@Override
	void roi(float roi) {
		// TODO Auto-generated method stub
		System.out.println("HDFC Rate of Interest:"+ roi);
		
	}

	}


public class Main {
public static void main(String[] args) {
	
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
	System.out.println("1. SBI \n 2. HDFC \n Choose bank:");

	int choice =scanner.nextInt();
	
	switch (choice) {
	case 1: {
		Rbi rbi = new Sbi();
		rbi.roi(9.8f);
		break;
	}
	case 2: {
		Rbi rbi = new Hdfc();
		rbi.roi(12f);
		break;
	}
	default:
		throw new IllegalArgumentException("Unexpected value: " + choice );
	}
}
}
