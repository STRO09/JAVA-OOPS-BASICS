package q2;


class Car {
    String name;
    String model;

    public Car(String name, String model) { 
        this.name = name;
        this.model = model;
    }

    public void display() {
        System.out.println("Car: " + name + " - Model: " + model);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "M8"); 
        car1.display(); 
    }
}
