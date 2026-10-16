
import java.util.Scanner;
public class ArthamaticOperators {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your First Number: ");
        double x = scanner.nextDouble();

        System.out.println("Enter Your Second Number: ");
        double y = scanner.nextDouble();

        scanner.close();

        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);


    }
}
