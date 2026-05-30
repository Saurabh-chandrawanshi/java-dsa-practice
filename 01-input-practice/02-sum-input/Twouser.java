import java.util.Scanner;

public class Twouser {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter input on =");
        int a = sc.nextInt();
        System.out.println("enter second input =");
        int b = sc.nextInt();
         
        System.out.println("Sum of " + a + " and " + b + " is = " +(a+b));
        sc.close();
    }
}
