// User se naam input lo aur print karo.
import java.util.Scanner;

public class userInput{
    public static void main(String[] args) {
        
   
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your input");
    int name = sc.nextInt();

    System.out.println("Youur out put is ="+name);
 
 sc.close();
}
}