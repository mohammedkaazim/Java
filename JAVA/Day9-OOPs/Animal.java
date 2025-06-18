class Animal {
    void sound() {
        System.out.println("Some animal sound...");
    }
}

class Dog extends Animal {
    void sound() {
        super.sound(); // calling parent method
        System.out.println("Dog barks 🐶");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}