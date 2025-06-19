public class FinallyDemo {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException");
        } finally {
            System.out.println("This block always runs.");
        }
    }
}
