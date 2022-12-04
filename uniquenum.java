public class uniquenum {
    public static void main(String[] args) {
        int arr[] = { 1, 6, 6, 3, 3, 8, 8, 9, 9 };

        int ans = unique(arr);
        System.out.println(ans);
    }

    private static int unique(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > -1) {
                    if (arr[i] == arr[j]) {
                        arr[i] = arr[j] = -1;

                    }
                }

            }

            if (arr[i] > -1) {
                return arr[i];
            }

        }
        return 0;

    }
}
