

class IDU {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int index = 2;
        int newValue = 10;

        arr[index] = newValue;

        System.out.print("Updated array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}