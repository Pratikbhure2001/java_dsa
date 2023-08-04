/**
 * sorting
 */
public class sorting {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5, 7, 9, 11, 12 };
        int target = 12;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    // binary search
    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start);

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;

            } else {
                return mid;
            }

        }

        return -1;
    }



    //bubble sort

    

}