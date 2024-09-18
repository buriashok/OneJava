public class printPattA {
    public static void main(String[] args){
        int num2 = 1;
        for (int i = 0; i < 5; i++) {
            int apple = num2;
            while (apple > 0) {
                System.out.print(num2);
                apple--;
            }
            num2++;
            System.out.println(" ");
        }
    }
}
