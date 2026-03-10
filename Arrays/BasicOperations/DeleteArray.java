package Arrays.BasicOperations;

public class DeleteArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int indexToDelete = 2; // Index of the element to delete

        // Shift elements to the left
        for (int i = indexToDelete; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Optional: Set the last element to a default value (e.g., 0)
        arr[arr.length - 1] = 0;

        System.out.print("Array after deletion: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}