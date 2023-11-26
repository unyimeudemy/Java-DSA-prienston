import java.util.Arrays;

public class ResizingArray {
    private static int[] numArray;
    private int N;
    
    public ResizingArray(int size){
        numArray = new int[size];

    }

    public static void main(String[] args){
        ResizingArray resizableArr = new ResizingArray(3);

        resizableArr.push(3);
        resizableArr.push(4);
        resizableArr.push(5);
        resizableArr.push(5);
        resizableArr.push(5);
        resizableArr.push(5);
        resizableArr.push(3);
        resizableArr.push(3);
        resizableArr.push(3);
        resizableArr.push(3);
        resizableArr.push(4);
        resizableArr.push(4);
        resizableArr.pop();
        resizableArr.pop();
        resizableArr.pop();
        resizableArr.pop();
        resizableArr.pop();
        resizableArr.pop();
        resizableArr.pop();
        resizableArr.pop();
        resizableArr.pop();
        System.out.println(Arrays.toString(numArray));

    }


    public void push(int dataToPush){
        if(N == numArray.length){
            resizeArr(2 * N);
        }
        numArray[N++] = dataToPush;
    }

    public int pop(){
       int temp = numArray[--N] ;
       numArray[N] = 0;
       if(N > 0 && N == (numArray.length/4)){
        resizeArr(numArray.length/2);
       }
       return temp;
    }

    public void resizeArr(int N){
        int[] doubledArr = new int[N];

        for (int i = 0; i < N; i++){
            if(i < numArray.length){
                doubledArr[i] = numArray[i];
            }
        }
        numArray = doubledArr;
    }



}


