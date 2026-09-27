import java.util.Scanner;

public class triangle_validity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Q.12 wap to input angles of trianlge and give the answer trianlge is valid or invalid
        System.out.print("Enter first angle of Triangle: ");
        int a = sc.nextInt();
        System.out.print("Enter second angle of Triangle: ");
        int b = sc.nextInt();
        System.out.print("Enter third angle of Triangle: ");
        int c = sc.nextInt();

        if(a>0 && b>0 && c>0 && (a+b+c)==180){
            System.out.println("Triangle is valid");
        }
        else{
            System.out.println("Invalid triangle");
        }

    }
}
