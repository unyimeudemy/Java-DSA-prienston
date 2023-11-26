import java.util.Arrays;

public class BitonicArray {
    private static int[] arr = {3, 1, 7, 4, 9};

    public static void main(String[] args){
        BitonicArray bitonicArray = new BitonicArray();
        System.out.println(bitonicArray.binarySearch(arr, 4)); 
    }

    
    public int binarySearch(int[] dataSet, int searchValue){
        Arrays.sort(dataSet);
        int left = 0;
        int right = dataSet.length - 1;
        System.out.println(Arrays.toString(dataSet));

        while(left <= right){
            int middle = (left + right)/2;
            if(searchValue > dataSet[middle]){
                left = middle + 1;
            }else if(searchValue < dataSet[middle]){
                right = middle - 1;
            }else{
                return middle;
            }
        }
        return -1;
    }



}
