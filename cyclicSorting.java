import java.util.Arrays;

public class cyclicSorting {
    public static void main(String[] args) {
        int[] arr={10,4,6,3,9,8,5,6,7,1};
        cyclicSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr) {
        int i=0;
        while(i < arr.length){
            int correctIndex = arr[i]-1;
            //here we want to check if the index we are checking i.e "i" index == the value in i-1 (correct index)
            //means we want to know if 3 that is in i index is in arr[i]-1 ==2 so 3 should be in 2 index i.e i should be 2 or else swap
            if (arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int first , int second){
        int temp= arr[first];
        arr[first]= arr[second];
        arr[second]= temp;
    }
}
