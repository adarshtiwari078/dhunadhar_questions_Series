public class SumOfAllElements {
    public static void main(String[] args) {

        // Find the Sum of All Elements in this array
        int[] numbers = {10, 20, 30, 40, 50,90,30,10};
        int sum = 0;
        int n = numbers.length;

        for(int i=0;i<n;i++){
            sum+=numbers[i];
        }
        System.out.println("Sum of all elements in a given array is: "+sum);
    }
}
