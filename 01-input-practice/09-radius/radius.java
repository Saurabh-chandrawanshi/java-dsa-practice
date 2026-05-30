import java.util.Scanner;

public class radius {
    
    public static void main(String[] args) {
        double pi = 3.14;
        Scanner sc = new Scanner(System.in);
        
       System.out.println("Enter your R = ");
    double radius = sc.nextDouble();
    double area = pi * radius*radius;
     System.out.println("your area is  ="+area);
     sc.close();
    }
}
