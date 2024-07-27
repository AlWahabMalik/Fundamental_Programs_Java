import java.util.Scanner;
public class ManyInputsFromUser {
    public static void main(String[] args)
{
    Scanner input= new Scanner(System.in);
    System.out.print("Enter 1st number");
   int number1=input.nextInt();
   System.out.print("Enter 2nd number");
   int number2=input.nextInt();
   System.out.print("You Entered " +number1+" and "+ number2);
   input.close();
}
}
