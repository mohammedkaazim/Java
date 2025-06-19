import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Banana");  // allows duplicates

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
