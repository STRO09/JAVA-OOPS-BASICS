package finallyblock;


public class Main {
public static void main(String[] args) {
	int[] array = {2,5,6,2};
	try {

		System.out.println(array[5]);
	} catch (ArrayIndexOutOfBoundsException e) {
		// TODO: handle exception
		System.out.println(e);
	}
	finally {

		for(int array2:array) {
			System.out.println(array2);
		}
	}
	
	
	try {
		int a  = 10/0;
	} finally {
		// TODO: handle finally clause
		System.out.println("a is equal to Infinity");
	}
}
}
