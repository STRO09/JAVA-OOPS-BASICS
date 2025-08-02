package anonymous_innerclass;

interface A {
	void meth1();
}


abstract class B {
	abstract void meth2() ;
}

public class Main {
public static void main(String[] args) {
	
	A a = new A() {
		
		@Override
		public void meth1() {
			// TODO Auto-generated method stub
			System.out.println("meth1");
			
		}
	};
	a.meth1();
	
	B b = new B() {
		
		@Override
		void meth2() {
			// TODO Auto-generated method stub
			System.out.println("meth2");
			
		}
	};
	b.meth2();
}
}
