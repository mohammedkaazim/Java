public class StringCompare {
    public static void main(String[] args) {
        String s1 = "Kaazim";
        String s2 = "kaazim";

        System.out.println("Using == : " + (s1 == s2)); // false
        System.out.println("Using equals() : " + s1.equals(s2)); // false
        System.out.println("Ignore case equals : " + s1.equalsIgnoreCase(s2)); // true
    }
}
