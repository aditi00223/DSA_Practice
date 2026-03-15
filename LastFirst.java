class LastFirstOccurrence {

    static int firstOccurrence(int arr[], int x) {
        int low = 0, high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == x) {
                result = mid;
                high = mid - 1;   // move left
            }
            else if (arr[mid] < x) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return result;
    }

    static int lastOccurrence(int arr[], int x) {
        int low = 0, high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == x) {
                result = mid;
                low = mid + 1;   // move right
            }
            else if (arr[mid] < x) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int arr[] = {1,2,2,2,3,4,5};
        int x = 2;

        int first = firstOccurrence(arr, x);
        int last = lastOccurrence(arr, x);

        System.out.println("First Occurrence: " + first);
        System.out.println("Last Occurrence: " + last);
    }
}