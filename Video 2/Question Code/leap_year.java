import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        Q.6 take input year and tell the year is leap year or not
//        leap year condition -
//                year is divisible by 400- leap_year
//                year is divisible by 100- not leap year
//                year is divisible by 4 - leap_year
//                else not leap
        System.out.print("Enter the year :");
        int year= input.nextInt();

        if(year%400==0){
            System.out.println("The year is a leap year");
        }
        else if(year%100==0){
            System.out.println("The year is not leap year");
        }
        else if(year%4==0){
            System.out.println("The year is a leap year");
        }
        else{
            System.out.println("The year is not leap year");
        }
    }
}
