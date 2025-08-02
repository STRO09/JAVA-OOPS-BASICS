package q5;



class Animal {
	

 void makeSound() {
		// TODO Auto-generated method stub
System.out.println("yells gibberish");
	}
}

class Dog extends Animal{
	
	@Override
	void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Woof");
	}
}
public class Main {
	
public static void main(String[] args) {
	Animal animal = new Animal();
	animal.makeSound();
	Dog dog = new  Dog();
	dog.makeSound();
}

}
