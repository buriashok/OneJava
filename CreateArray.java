import java.util.Scanner;

public class CreateArray { 

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int arraySize = sc.nextInt();
        if (arraySize <= 0) {
            System.out.println("Array size must be greater than 0.");
            sc.close();
            return;
        }
        int[] arr = new int[arraySize];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements of the array are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); 
        }
        System.out.println();
        sc.close();
    }
}