import java.util.Scanner;

public class voting_eligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//      Q.5  take input age and tell the person is eligible for voting or not
        System.out.print("Please enter you age:");
        int age = input.nextInt();

        if(age>=18){
            System.out.println("You are eligible for voting");
        }
        else{
            System.out.println("You are not eligible for voting");
        }
    }
}
