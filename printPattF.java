//this program prints different types of patterns
public class priPat {
    public static void main(String[] args){
        for (int i = 0; i < 3; i++) {

            for (int k=0;k<5;k++){
                System.out.print("<");

            }
            System.out.println(" ");

                for (int j = 0; j < 5; j++) {
                    if(i==2) {
                        break;
                    }
                        System.out.print(">");

                }
                System.out.println(" ");

        }

    }
}
