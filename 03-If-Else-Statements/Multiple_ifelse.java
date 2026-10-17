package IF_ELSE;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Multiple_ifelse {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Your Salary: ");
        int Salary = sc.nextInt();


        // If-Else
        if(Salary>=20000){
            System.out.println("ERROR INPUT");
        }else if(Salary>=15000){
           int S1 = Salary+5000;
           System.out.println("Your Updated Salary is: "+ S1);
        }else{
           int S2 = Salary + 2500;
            System.out.println("Your Updated Salary is: "+ S2);
        }
        sc.close();
    }
}
