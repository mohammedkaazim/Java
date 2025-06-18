class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("2 Params: " + calc.add(5, 10));
        System.out.println("3 Params: " + calc.add(5, 10, 15));
    }
}
