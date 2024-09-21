//printing the unique merged array...
import java.util.Scanner;
public class dayOneB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size1: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }
        System.out.print("Enter size2: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }
        int[] tempArray = new int[size1 + size2];
        int index = 0;

        // Add elements from the first array
        for (int i = 0; i < size1; i++) {
            if (!contains(tempArray, index, array1[i])) {
                tempArray[index++] = array1[i];
            }
        }

        // Add elements from the second array
        for (int i = 0; i < size2; i++) {
            if (!contains(tempArray, index, array2[i])) {
                tempArray[index++] = array2[i];
            }
        }

        // Create the final array with only unique elements
        int[] uniqueArray = new int[index];
        for (int i = 0; i < index; i++) {
            uniqueArray[i] = tempArray[i];
        }

        // Print the merged unique array
        System.out.print("Merged array with unique elements: ");
        for (int element : uniqueArray) {
            System.out.print(element + " ");
        }
    }

    // Helper method to check if an array contains a value
    private static boolean contains(int[] array, int size, int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true; // Found a duplicate
            }
        }
        return false; // No duplicate found
    }
}
