import java.util.Scanner;


public class IfElse_ElseIf {
  public static void main(String[] args){
     Scanner scanner=new Scanner(System.in);
      System.out.println("ENTER YOUR MARKS: ");
      int marks=scanner.nextInt();

     scanner.close();
      if(marks>=100) {
          System.out.println("Invalid Marks, Try agian");
      }else if(marks >=35){
          System.out.println(" You Passed ");
      }else{
         System.out.print("You Failed, Better Luck Next Time");
     }
  }
}
