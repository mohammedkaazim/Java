public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {23, 45, 11, 99, 64};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum number: " + max);
    }
}
