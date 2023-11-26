import java.util.Arrays;

public class Threesum {
    private int[] indexes = {-1, -1, -1};
    private static int[] numsArr = { 2, 1, 4, 3, 5};

    public Threesum (){

    }

    public static void main(String[] args){
        Threesum threesum = new Threesum();

        String result = threesum.threeSumBruteForce(numsArr, 10);
        System.out.println(result);
        // int[] result2 = threesum.threeSumOptimised2(numsArr, 10);
        // System.out.println(Arrays.toString(result2));
    }
    

    public String threeSumBruteForce(int[] numsArr, int target){
        for(int i = 0; i <numsArr.length - 1; i++){
            for(int j = i + 1; j < numsArr.length ; j++){
                for(int k = j + 1; k < numsArr.length ; k++){
                    if(numsArr[i] + numsArr[j] + numsArr[k] == target){
                        indexes[0] = i;
                        indexes[1] = j;
                        indexes[2] = k;
                        return  Arrays.toString(indexes);
                    }
                }
            }
        }
        return Arrays.toString(indexes);
    }

    public int[] threeSumOptimised(int[] numArr, int mainTarget){
        System.out.println(Arrays.toString(numArr));
         Arrays.sort(numArr);
         int right = numArr.length - 1;
         int left = 1;
         int choosenTarget = numArr[0];
         int temp = 0;
         System.out.println(Arrays.toString(numArr));
         while(numArr[left] + numArr[right] + choosenTarget != mainTarget){
                temp = left;
                left = left + 1;
                choosenTarget = temp;
            if(left < numArr.length - 2){
        return new int[]{-1, -1, -1};

            }
         }
        return new int[]{left, choosenTarget, right};
    }

 
}
