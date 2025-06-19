import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();

        names.add("Kaazim");
        names.add("Fouziya");
        names.add("Kaazim");  // ignored

        for (String name : names) {
            System.out.println(name);
        }
    }
}
