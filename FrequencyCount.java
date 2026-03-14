import java.util.*;

public class FrequencyCount {

    public static void countFrequency(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            }
            else {
                map.put(num, 1);
            }
        }

        // To print in sorted order
        TreeMap<Integer, Integer> sortedMap = new TreeMap<>(map);

        for(int key : sortedMap.keySet()) {
            System.out.println(key + " : " + sortedMap.get(key));
        }
    }

    public static void main(String[] args) {

        int[] arr = {4,2,7,2,4,3,7,7,1};

        countFrequency(arr);
    }
}