import java.util.Scanner;


public class charinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the charecter = ");
        char student = sc.next().charAt(4);

                System.out.println(student);
                sc.close();
    }
}
