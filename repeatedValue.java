public class repeatedValue {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 10, 4, 5, 3, 7, 2, 9 };

        int ans = repvalue(arr);
        System.out.println(ans);
    }

    private static int repvalue(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }

            }

        }
        return 0;
    }
}
