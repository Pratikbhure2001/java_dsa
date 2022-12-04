public class totalOccur {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 1, 6, 1 };
        int target = 1;
        int ans = totOccur(arr, target);
        System.out.println(ans);
    }

    private static int totOccur(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                count++;
            }

        }

        return count;
    }
}
