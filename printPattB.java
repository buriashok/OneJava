public class printPattB {
    public static void main(String[] args){
        int i,j=0;
        for( i=1;i < 6;i++){
            j=i;
            while(j>0){
                System.out.print("*");
                j--;
            }
            System.out.println(" ");
        }
    }
}
