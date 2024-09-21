import java.util.Scanner;
public class delPosArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element "+(i+1)+": ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter position: ");
        int position = scanner.nextInt();
        if (position < 0 || position >= size) {
            System.out.println("Invalid position");
            return;
        }
        int[] newArray = new int[size - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != position) {
                newArray[j++] = array[i];
            }
        }
        System.out.print("Updated Array: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]+" ");
        }
    }
}

