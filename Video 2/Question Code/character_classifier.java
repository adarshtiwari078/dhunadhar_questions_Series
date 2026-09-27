import java.util.Scanner;

public class character_classifier {
    public static  void main(String args[]) {
        Scanner input = new Scanner(System.in);

// Q.9 Take input as charecter and specifies the charecter is Capitalcase alphabet, Smallcase Alphabet, digit or special charecter

        System.out.print("Enter your Charecter :");
        char ch=input.next().charAt(4);

        if(ch>='A' && ch<='Z') {
            System.out.println("Your Charecter is Capital Case Alphabet");
        }
        else if(ch>='a' && ch<='z') {
            System.out.println("Your Charecter is Small Case Alphabet");
        }
        else if(ch>='0' && ch<='9') {
            System.out.println("Your Charecter is digit");
        }
        else{
            System.out.println("Your Charecter is Special Charecter");
        }
        System.out.println(ch);
    }
}
