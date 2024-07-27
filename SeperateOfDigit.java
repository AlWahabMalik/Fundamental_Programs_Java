import java.util.*;
    public class SeperateOfDigit 
    { 
      public static void main(String[] args) 
      {
           int digit; 
           Scanner input= new Scanner(System.in);
            System.out.println("Enter an integer");
            int num=input.nextInt();
            input.close();
           while(num>0)
           {
               digit=num%10;
               num=num/10;
               System.out.println("digits are "+ digit);
           }
       }
    }

