import java.util.ArrayList;

public class AllOcc {
    public static void main(String[] args) {
        int[] arr = {5,2,7,2,9,2};
        int target = 2;

        ArrayList<Integer> indices = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                indices.add(i);
            }
        }

        System.out.println("Element found at indices: " + indices);
    }
}
    

