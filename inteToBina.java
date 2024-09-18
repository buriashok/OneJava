import java.sql.SQLOutput;
import java.util.Scanner;
public class inteToBina {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int num1= scanner.nextInt();
        int[] binary1 = new int[1000];
        int i=0;
        int num2=0;
        num2=num1;
        while(num1>0){
            binary1[i]=num1%2;
            num1=num1/2;
            i++;
        }
        System.out.println("Decimal number: "+num2);
        System.out.println("Binary number: ");
        for(int j=i-1;j>=0;j--){
            System.out.print(binary1[j]);
        }
    }
}
