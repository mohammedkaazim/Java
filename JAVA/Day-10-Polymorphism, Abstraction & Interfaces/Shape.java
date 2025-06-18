abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    void area() {
        System.out.println("Circle area = π * r * r");
    }
}

class Square extends Shape {
    void area() {
        System.out.println("Square area = side * side");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.area();
    }
}
