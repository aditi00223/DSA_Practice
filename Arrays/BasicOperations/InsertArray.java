package Arrays.BasicOperations;

public class InsertArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int index = 2;
        int value = 99;

        int[] newArr = new int[arr.length + 1];

        // Copy elements before index
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }

        // Insert value
        newArr[index] = value;

        // Shift remaining elements
        for (int i = index; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        // Print new array
        System.out.print("Updated array: ");
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
}