public class printPattC {
    public static void main(String[] args){
        int i,j,row=5;
        //outer loop for column
        for(i=0;i<row;i++){
            //inner loop for row
            for(j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();//throw the curser to new line
        }
    }

}