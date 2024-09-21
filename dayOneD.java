//This progarm mergs two arrays
import java.util.Scanner;
public class dayOneD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input for first array
        System.out.print("Enter size1: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }
        // Input for second array
        System.out.print("Enter size2: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }
        // Merge the two arrays
        int size3 = size1 + size2;
        int[] array3 = new int[size3];

        // Copy elements of the first array
        for (int i = 0; i < size1; i++) {
            array3[i] = array1[i];
        }

        // Copy elements of the second array
        for (int i = 0; i < size2; i++) {
            array3[size1 + i] = array2[i];
        }
        System.out.println(array3.length);
    }
}

