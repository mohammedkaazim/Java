import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Kaazim");
        students.put(102, "Fouziya");
        students.put(103, "Anwar");

        for (Integer roll : students.keySet()) {
            System.out.println("ID: " + roll + " -> " + students.get(roll));
        }
    }
}
