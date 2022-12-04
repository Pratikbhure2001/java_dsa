/**
 * totalpairs
 */
public class totalpairs {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 6;
        int ans = pairsum(arr, target);
        System.out.println(ans);
    }

    public static int pairsum(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    count++;
                }

            }

        }
        return count;
    }
}