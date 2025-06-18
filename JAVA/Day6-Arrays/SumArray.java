public class SumArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int sum = 0;

        for (int value : arr) {
            sum += value;
        }

        System.out.println("Sum: " + sum);
    }
}
