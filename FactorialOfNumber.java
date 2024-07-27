import java.util.*;
public class FactorialOfNumber {
    public static void main(String[] args) {
        int fac=1;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=input.nextInt();
        input.close();
    
    for(int i=1; i<=number; i++)
    {
        fac=fac*i;
    }
System.out.println("Factorial of number is: "+fac);
}    
}
