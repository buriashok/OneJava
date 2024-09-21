import java.util.Scanner;
public class delBegArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element "+(i+1)+": ");
            array[i] = scanner.nextInt();
        }
        int[] newArray = new int[size - 1];
        for (int i = 1; i < array.length; i++) {
            newArray[i - 1] = array[i];
        }
        System.out.print("Updated Array: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]+" ");
        }
    }
}
