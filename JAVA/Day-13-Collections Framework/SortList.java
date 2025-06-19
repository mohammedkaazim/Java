import java.util.ArrayList;
import java.util.Collections;

public class SortList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(10);
        numbers.add(99);

        Collections.sort(numbers); // ascending

        System.out.println("Sorted: " + numbers);
    }
}
