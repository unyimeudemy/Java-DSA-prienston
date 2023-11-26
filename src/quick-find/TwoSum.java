import java.util.Arrays;

public class TwoSum {
    private int[] sumIndexes = {-1, -1};
    private static int[] nums = {16, 8, 23, 4, 15};
    private int[] numsClone;
    
    TwoSum () {
        numsClone = nums.clone();
    }

    public static void main (String[] args){
        
        TwoSum findSum = new TwoSum();
        System.out.println(findSum.bruteForcedTwoSum(nums, 24));
        // System.out.println(findSum.optimizedTwoSum(nums, 24));
  
    }

    public String bruteForcedTwoSum(int[] nums, int target){
        for (int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    sumIndexes[0] = i;
                    sumIndexes[1] = j;
                    return Arrays.toString(sumIndexes);
                }
            }
        }
        return Arrays.toString(sumIndexes);
    }

    public String optimizedTwoSum(int[] nums, int target){
        Arrays.sort(nums);
        System.out.println("nums: " + Arrays.toString(nums));
        System.out.println("numsClone: " + Arrays.toString(numsClone));
        int right = nums.length - 1;
        int left = 0;

        while(nums[right] + nums[left] != target){
            if(nums[right] + nums[left] > target){
                right = right - 1;
            }else if(nums[right] + nums[left] < target){
                left = left + 1;
            }else{
                return Arrays.toString(sumIndexes);
            }
        }

            int num1 = nums[right];
            int num2 = nums[left];
            sumIndexes[0] = indexOf(numsClone, num1);
            sumIndexes[1] = indexOf(numsClone, num2);

        return Arrays.toString(sumIndexes);
    }

              private static int indexOf(int[] array, int target) {
                for (int i = 0; i < array.length; i++) {
                    if (array[i] == target) {
                        return i;
                    }
                }
                return -1;
            }



}
