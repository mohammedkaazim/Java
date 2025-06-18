interface Animal {
    void eat();
    void sound();
}

class Cat implements Animal {
    public void eat() {
        System.out.println("Cat eats fish 🐟");
    }

    public void sound() {
        System.out.println("Meow 🐱");
    }
}

public class Main {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
        c.sound();
    }
}
