class Vehicle {
    void run() {
        System.out.println("Vehicle is running...");
    }
}

class Bike extends Vehicle {
    void run() {
        System.out.println("Bike is running at 80kmph...");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Bike();  // Polymorphism
        v.run();
    }
}
