import java.util.Scanner;
public class InputFromUser {
    public static void main(String[] args)
    {
     Scanner input=new Scanner(System.in);
     System.out.print("Enter a number");
     int number=input.nextInt();
     System.out.print("You Entered"+ number);
     input.close();
    }
    
    
}
