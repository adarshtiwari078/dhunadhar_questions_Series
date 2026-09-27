import java.util.Scanner;

public class greatest_between_two {
    public static void main(String[] args) {
//     Q.3  Take 2 input integer and tell who is greatest
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1=input.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2=input.nextInt();
        if(num1>num2){
            System.out.println("the number first is greater than the number second");
        }
        else{
            System.out.println("the number second is greater than the number first");
        }
    }
}
