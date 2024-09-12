// i am writing program in java that
//  creates a array and print the elements of the array

public class creArra {
    public static void main(String[] args){
        int[] arr1 = new int[3];
        arr1[0]=66;
        arr1[1]=77;
        arr1[2]=88;
        System.out.println("Elements of array: ");
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
