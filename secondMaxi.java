public class secondMaxi {
    public static void main(String[] args) {
        int arr[] = { 1, 9, 3, 10, 4, 5, 6, 7, 8, 9 };
        int max = Integer.MIN_VALUE;
        int ans = secMax(arr, max);
        System.out.println(ans);
    }

    private static int secMax(int[] arr, int max) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] >= max) {
                max = arr[i];

            }

        }

        for (int j = 0; j < arr.length; j++) {

            if (arr[j] == max) {
                arr[j] = 0;
            }
        }

        int secmax = Integer.MIN_VALUE;
        for (int k = 0; k < arr.length; k++) {

            if (arr[k] > secmax) {
                secmax = arr[k];
            }

        }

        return secmax;
    }
}
