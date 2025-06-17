public class AreaCalculator {
    // Area of a circle
    public static double area(double radius){
        return Math.PI * radius * radius;
    }

    // Area of a rectangle
    public static double area(double length, double width){
        return length * width;
    }

    public static void main(String[] args) {
        System.out.println("Circle area: " + area(3.5));
        System.out.println("Rectangle area: " + area(5, 4));
    }
}