public class CountEvenAndOddNumbers {
    public static void main(String[] args) {
//      3.  Count Even and Odd Numbers in this Array
        int[] arr = {12, 17, 19, 20, 22};
        int n = arr.length;
        int even=0,odd=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                odd++;
            }
            else{
                even++;
            }
        }
        System.out.println("Even numbers and odd numbers are: "+even+","+odd);
    }
}
