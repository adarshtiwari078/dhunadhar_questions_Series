import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//    Q.11    make a calculator
     int a=input.nextInt();
     char op=input.next().charAt(0);
     int b=input.nextInt();

     if(op=='+'){
         System.out.println("Addition : "+(a+b));
     }
     else if(op=='-'){
         System.out.println("Subtraction : "+(a-b));
     }
     else if(op=='*'){
         System.out.println("Multiplication : "+(a*b));
     }
     else if(op=='/'){
         if(b!=0){
             System.out.println("Division : "+a/b);
         }
         else {
             System.out.println("if your divide any number 0 this give error");
         }
     }

     else{
         System.out.println("Invalid operator ");
     }

    }
}
