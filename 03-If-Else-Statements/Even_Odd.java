package IF_ELSE;

import java.util.Scanner;
class Even_Odd {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Number: ");
        long x = scanner.nextLong(); //long variable is useful for long numbers

        if(x%2==0){
            System.out.println("Given Number is Even");
        }else{
            System.out.println("Given Number is Odd");
        }
        scanner.close();

    }
}
