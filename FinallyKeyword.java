import java.util.*;

public class FinallyKeyword {
    public static void main(String[] args) {
        int arr[] = { 344, 2345, 356, 67, 64 };
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter index number");
            int index = input.nextInt();
            System.out.println("Element is " + arr[index]);
        } catch (Exception e) {
            System.out.println("Index not Found");
        } finally {
            System.out.println("Finally  BLock is executed");
        }
        System.out.print("Array Elements are   ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
