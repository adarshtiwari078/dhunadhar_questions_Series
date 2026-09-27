import java.util.Scanner;

public class positive_or_negative {
    public static void main(String[] args) {
// Q.1  WAP to take input integer and identify the input number is Positive,Negative or Zero

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter integer: ");
        int num = input.nextInt();

        if(num < 0){
            System.out.println("negative number");
        }
        else if(num > 0){
            System.out.println("positive number");
        }
        else{
            System.out.println("zero number");
        }

    }
}
