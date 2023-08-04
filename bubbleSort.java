public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 6, 4, 5, 9, 8, 7 };
        int ans[] = BubbleSort(arr);
        for (int i : ans) {
            System.out.println(i);
        }

    }

    private static int[] BubbleSort(int[] arr) {
//i loop will run for n-1 times
//j loop will run for n-1-i times as end of the each ith iteration last element will be sorted.
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }
}
