import java.util.Scanner;
public class insePosArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array1 size: ");
        int size = scanner.nextInt();
        int[] array1 = new int[size];
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Enter element "+ (i+1)+": ");
            array1[i] = scanner.nextInt();
        }
        System.out.print("Enter position to Insert: ");
        int pos = scanner.nextInt();
        System.out.print("Enter new Element: ");
        int newE = scanner.nextInt();
        int[] array2 = new int[size + 1];
        for (int i = 0; i < array2.length; i++) {
            if (i < pos) {
                array2[i] = array1[i];
            } else if (i == pos) {
                array2[i] = newE;
            } else {
                array2[i] = array1[i - 1];
            }
        }
        System.out.print("Original Array: ");
        for(int i=0;i<array1.length;i++){
            System.out.print(array1[i]+" ");
        }
        System.out.println();
        System.out.print("Updated Array: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}
