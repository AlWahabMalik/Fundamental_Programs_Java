import java.util.Scanner;
public class ManyInputsFromUser2 {
    public static void main(String[] args)
{
    Scanner input= new Scanner(System.in);
    System.out.print("Enter Your name");
    String name=input.nextLine();
   System.out.print("Enter your marks");
   int marks=input.nextInt();
   System.out.print("Marks of "+name+" are "+ marks);
   input.close();
}
}

