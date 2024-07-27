import java.util.*;
public class AlphabetOrNot{
     public static void main(String[] args)
     {
         Scanner input=new Scanner(System.in);
        System.out.println("Enter a character");
        char ch=input.next().charAt(0);
        input.close();
        if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
        {
            System.out.println(ch+" is an Alphabet");
        }
        else
        {
            System.out.println(ch+" is not an Alphabet");
        }
     }
}
