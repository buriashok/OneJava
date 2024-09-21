import java.util.Scanner;

public class dayOneE {

    // Function to count occurrences of the target using linear search
    public static int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        int n = sc.nextInt();

        // Input the sorted array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input target element
        int target = sc.nextInt();

        // Get the count of occurrences and print the result
        int result = countOccurrences(arr, target);
        System.out.println(result);

        sc.close();
    }
}
