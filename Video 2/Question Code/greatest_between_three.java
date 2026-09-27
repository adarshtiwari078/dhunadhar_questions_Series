import java.util.Scanner;

public class greatest_between_three {
    public static void main(String[] args) {
//       Q.7  take 3 input integer numebr and tell who is greatest number
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd Number: ");
        int num2 = input.nextInt();
        System.out.print("Enter 3rd Number: ");
        int num3 = input.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("first number is greatest");
        }
        else if(num2>num1 && num2>num3){
            System.out.println("second number is greatest");
        }
        else {
            System.out.println("third number is greatest");
        }
    }
}
