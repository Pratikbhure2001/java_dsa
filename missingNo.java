public class missingNo {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int target = 1;
        int ans = misingNo(arr, target);
        System.out.println(ans);
    }

    private static int misingNo(int[] arr, int target) {

        int start = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != start) {
                return start;
            }

            start++;

        }
        return 0;
    }
}
