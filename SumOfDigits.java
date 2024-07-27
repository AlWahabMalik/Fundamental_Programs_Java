import java.util.*;
public class SumOfDigits 
    {
        public static void main(String[] args) {
            int sum=0;
            Scanner input= new Scanner(System.in);
            System.out.println("Enter an integer");
            int num=input.nextInt();
            input.close();
           while(num>0)
           {
               sum=sum+num%10;
               num=num/10;
           }

         System.out.println("Sum is "+sum);
                }
    
}
