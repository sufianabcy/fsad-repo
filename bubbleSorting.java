import java.util.Arrays;

public class bubbleSorting{
    public static void main(String[] args) {
        int[] arr={6,2,4,8,4,5,7,2};
        bubbly(arr);

        System.out.println(Arrays.toString(arr));
    }
    static void bubbly(int[] arr){
        boolean swapped;
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped=false;
            //for each index, max items will come at the last respective index
            for (int j = 1; j < arr.length-i; j++) {

                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
