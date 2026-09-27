import java.util.Scanner;

public class divisible_five_eleven {
    public static void main(String[] args) {
//       Q.4  take input integer and tell the number is divisible by 5 and 11.
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter integer: ");
        int num = input.nextInt();

        if(num%5==0 && num%11==0){
            System.out.println("The number is divisible by five  and eleven");
        }
        else{
            System.out.println("The number is not  divisible by five and eleven");
        }
    }
}
