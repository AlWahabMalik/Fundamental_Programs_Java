import java.sql.Array;
import java.util.Scanner;

public class ExcptionHandling {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter element of array");
            arr[i] = input.nextInt();
        }
        System.out.println("Elements you Entered are: ");
        System.out.print("{");
        for (int j : arr) {
            System.out.print(j + ",");
        }
        System.out.println("}");

    }
}
