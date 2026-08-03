package Array;

public class MoveZeroes {
    public static void main(String [] args) {
        int n = 0;
        int[] arr= { 0,1,1,0,2,3 ,0,0,3,12};
        for(int i = 0;i<arr.length;i++){
            if(arr[i] != 0){
                int temp= 0;
                temp = arr[i];
                arr[i] = arr[n];
                arr[n] =temp;
                n++;
            }
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

    }
}
