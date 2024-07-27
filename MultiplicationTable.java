import java.util.*;
public class MultiplicationTable {
    public static void main(String[] args)
    {
        int product;
   Scanner input= new Scanner(System.in);
   System.out.println("Enter a number");
   int num=input.nextInt();
   input.close();
   {
       for (int i = 1; i<=10; i++) 
       {
           product=i*num;
           System.out.println(i+" * "+num+"="+product);
       }
   }
    }
    
}
