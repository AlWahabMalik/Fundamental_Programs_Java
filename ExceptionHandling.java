import java.util.*;

public class ExceptionHandling {
    public static void main(String[] args)

    {
        double result;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter fist number");
        double num1 = input.nextDouble();
        try {
            System.out.println("Enter 2nd number");
            double num2 = input.nextDouble();
            input.close();
            result = num1 / num2;
            System.out.println("Result is " + result);
        } catch (ArithmeticException e) {
            System.out.println("Zero can't be divided");
        } catch (Exception e) {
            System.out.println("Sorry");
        }
        System.out.println("First number You Entered " + num1);
    }
}