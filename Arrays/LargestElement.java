package Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 40, 15};

        int max = arr[0]; // assume first element is largest

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // update max if bigger element found
            }
        }

        System.out.println("Largest element is: " + max);
    }
}