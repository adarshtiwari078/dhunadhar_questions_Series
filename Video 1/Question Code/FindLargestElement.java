public class FindLargestElement {
    public static void main(String[] args) {
          // 2. Find largest Element in this Array
        int[] arr = {25, 11, 7, 75, 56,89,45,12,456,456,45,25,5,4,6};
        int n=arr.length;
        int largest=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("Largest element is "+largest);
    }
}
