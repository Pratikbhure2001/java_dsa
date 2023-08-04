public class selectionSort {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 6, 4, 5, 9, 8, 7,33,12,99,35,26,11 };
        int ans[] = selectioSort(arr);
        for (int i : ans) {
            System.out.println(i);
    }
}

    private static int[] selectioSort(int[] arr) {
for(int i=0;i<arr.length-1;i++){
    int max=Integer.MIN_VALUE;
    int index=0;
 for(int k=0;k<arr.length-i;k++){
         if(arr[k]>max){
            max=arr[k];
           index=k;
         }
        }
int temp=arr[arr.length-1-i];
arr[arr.length-1-i]=max;
arr[index]=temp;
   
}

        return arr;
    }


    
}