import java.util.Scanner;

public class electricity_bill_calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        Q.10 take input as elctricity unit and print the bill in rupees on this condition
//        First 100 → ₹5
//        Next 100 → ₹7
//        Above 200 → ₹10
        int bill=0;

        System.out.println("Enter your Units: ");
        int units = input.nextInt();

        if(units<0){
            System.out.println("Invalid Input");
        }
        else if(units<100){
            bill=units*5;
            System.out.println("Bill Amount : "+bill);
        }
        else if(units<200){
            bill=units*7;
            System.out.println("Bill Amount : "+bill);
        }
        else {
           bill=units*10;
           System.out.println("Bill Amount : "+bill);
        }
    }
}
