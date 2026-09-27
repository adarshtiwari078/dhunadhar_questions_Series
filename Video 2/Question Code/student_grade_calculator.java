import java.util.Scanner;

public class student_grade_calculator {
    public static void main(String[] args) {
//      Q.8  take input student marks and tell the grade of student according this
//        90–100 → A+
//        80–89 → A
//        70–79 → B
//        60–69 → C
//        50–59 → D
//        <50 → Fail

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Marks: ");
        int marks = input.nextInt();

        if(marks>100 || marks<0){
            System.out.println("Invalid Marks");
        }
        else if(marks>=90){
            System.out.println("A+ grade");
        }
        else if(marks>=80){
            System.out.println("A grade");
        }
        else if(marks>=70){
            System.out.println("B grade");
        }
        else if(marks>=60){
            System.out.println("C grade");
        }
        else if(marks>=50){
            System.out.println("D grade");
        }
        else{
            System.out.println("Failed");
        }
    }
}
