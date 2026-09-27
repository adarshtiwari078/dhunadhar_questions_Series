import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
//       4.  Linear Search in Java- find the target element in this array and give index position of target
        Scanner input = new Scanner(System.in);
        int[] arr = {5, 15, 25, 35, 45};
        System.out.print("Enter the number to be searched: ");
        int target = input.nextInt();
        Boolean found=false;
        int posion=0;
       for(int i=0;i<arr.length;i++){
           if(arr[i]==target){
               found=true;
               posion=i;
               break;
           }
           else{
               found=false;
           }
       }

       if(found==false){
           System.out.println("Not found");
       }
       else{
           System.out.println("Found");
           System.out.println("Target number: "+target);
           System.out.println("Position number: "+posion);
       }

    }
}
