package exception_propogation;

import java.io.IOException;

class A {
	
	public A() throws IOException {
		// TODO Auto-generated constructor stub
		IOException exception = new IOException();
		System.out.println(exception);
	}
	
}

class B{
	
	public B() throws IOException{
		// TODO Auto-generated constructor stub
		A a = new A();
		
	}
}

class C{
	public C() throws IOException {
		// TODO Auto-generated constructor stub
		B b = new B();
	}
}
public class Main {
public static void main(String[] args) {
	try {
		C c = new C();

	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
}
}
