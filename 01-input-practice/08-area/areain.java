import java.util.Scanner;

public class areain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length = ");
        int length =sc.nextInt();

        System.out.println("Enter your Breadth = ");
        int Breadth = sc.nextInt();
         
         float area = length* Breadth;
         System.out.println("your area is = "+area);
         sc.close();
    }
}
