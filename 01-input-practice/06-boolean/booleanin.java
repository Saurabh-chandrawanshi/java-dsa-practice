import java.util.Scanner;

public class booleanin{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your boolean input");
         boolean student = sc.hasNextBoolean();
         System.out.println(student);
         sc.close();
           
    }
}
