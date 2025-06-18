class Car {
    String brand = "Tesla";
    int speed = 200;

    void drive() {
        System.out.println("Driving " + brand + " at " + speed + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
    }
}
