public class insertionSort {
    public static void main(String[] args) {
        

        int[] arr = { 5,4,1,3,2,6,66,8,22,11,87,9 };
        int ans[] = InsertionSort(arr);
        for (int i : ans) {
            System.out.println(i);
        }
        
    }

    private static int[] InsertionSort(int[] arr) {

        for (int i = 1; i <=arr.length - 1; i++) {
            int value=arr[i];
            for (int j = i; j >0; j--) {
                if (value < arr[j -1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }
}
