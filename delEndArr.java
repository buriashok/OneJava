import java.util.Scanner;

public class delEndArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        if (size == 0) {
            System.out.println("Array is empty, nothing to delete.");
            return;
        }
        int[] newArray = new int[size - 1];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }
}

