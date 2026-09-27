import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
//   Q.2  Wap to take input integer and identify the number is odd or even
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter integer: ");
        int num = input.nextInt();

        if(num%2 ==0)
            {
            System.out.println("The number is even");
            }
        else{
            System.out.println("The number is odd");
        }

    }
}
