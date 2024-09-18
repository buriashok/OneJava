import java.util.Scanner;

public class factNum {

    static int factorial(int n)
    {
        int res = 1, i;
        for (i = 2; i <= n; i++)
            res *= i;
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num1 = scanner.nextInt();
            System.out.println("Factorial: " + factorial(num1));
        }

}


