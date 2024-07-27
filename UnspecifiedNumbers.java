import java.util.*;
public class UnspecifiedNumbers{
public static void main(String[] args)
{
   int number,count=0,pcount=0, ncount=0,sum=0;
   float avg;
   int counter;
    Scanner input=new Scanner(System.in);
    do{
    System.out.println("Enter a number");
     number=input.nextInt();
     sum=sum+number;
     count++;
     if(number>0)
     {
        pcount++;
     }
    else
     {
        ncount++;
     }
}while(number!=0);
    counter= count-1;
avg=sum/(float)counter;
System.out.println("Number of Positive: "+pcount);
System.out.println("Number of Negative:"+ncount);
System.out.println("Sum of numbers: "+sum);
System.out.println("Average of numbers: "+avg);
input.close();
}
}