public class LinearSearch{
    public static void main(String[] args) {
        int[] arr = {10, 25, 7, 14, 30};
        int target = 14;
        

        for (int i=0; i<arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at index:" +i);
                return;
            }
        }
        System.out.println("Element not found in the array.");

        
        }
    }
