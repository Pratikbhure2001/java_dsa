public class diffPair {
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5,6,7 };
        int target = 1;
       String ans= pairdiff(arr, target);
       System.out.println(ans);
    }

    private static String pairdiff(int[] arr, int target) {
       
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] - arr[i] == target) {
                  return "yes"; 
                  
                }
               

            }
        

        }
        return "no";
        
    }
}
