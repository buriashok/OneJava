import java.util.Scanner;
public class dayOneC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;
        do {
            System.out.print("Enter the number of words (1-15): ");
            size = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
        } while (size < 1 || size > 15);

        String[] words = new String[size];
        for (int i = 0; i < size; i++) {
            do {
                System.out.print("Enter word " + (i + 1) + " (max 100 characters): ");
                words[i] = scanner.nextLine().trim(); // Trim leading/trailing whitespace
            } while (words[i].length() > 100);
        }

        System.out.print("Enter the letter to check: ");
        char letter = scanner.next().charAt(0);

        int count = 0;
        for (String word : words) {
            if (word.charAt(0) == Character.toLowerCase(letter) || // Check lowercase
                    word.charAt(0) == Character.toUpperCase(letter)) { // Check uppercase
                count++;
            }
        }

        System.out.println("Number of words starting with '" + letter + "': " + count);

        scanner.close();
    }
}
