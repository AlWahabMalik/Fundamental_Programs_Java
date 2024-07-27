import java.util.*;
public class PrimeNumbersInRange {
    public static void main(String[] args)
    {
        int ctr;
     Scanner input= new Scanner(System.in);
System.out.println("Enter a starting number");
int start=input.nextInt();
System.out.println("Enter ending number");
int end=input.nextInt();
input.close();
System.out.println("Prime Numbers between range are: ");
for(int i=start; i<=end; i++)
{
    ctr=0;
    for(int j=2; j<=i/2; j++)
    {
        if(i%j==0)
        {
            ctr++;
            break;
        }
 }
   if(ctr==0)
    {
     System.out.println(i);
    }
    }
}
}
