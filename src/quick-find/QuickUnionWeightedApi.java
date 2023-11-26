import java.util.Scanner;

public class QuickUnionWeightedApi{
    private int[] arr;
    private int[] size;


    public QuickUnionWeightedApi(int N){
        arr = new  int[N];
        size = new int[N];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i;
            size[i] = 1;
        }
    }

    public static void main(String[] args){
        QuickUnionWeightedApi QUI = new QuickUnionWeightedApi(10);
   
        QUI.union(2, 3);
        QUI.union(3, 6);
        QUI.union(6, 8);
        System.out.println(QUI.isConnected(8, 2));
        System.out.println(QUI.isConnected(2, 1));
    }

    public boolean isConnected(int p, int q){
        return findBase(p) == findBase(q);
    }

    public void union (int p, int q){
        int baseOfP = findBase(p);
        int baseOfQ = findBase(q);

        if(size[baseOfP] > size[baseOfQ]){
            arr[baseOfQ] = baseOfP;
            baseOfP = baseOfP + baseOfQ;
        }else{
            arr[baseOfP] = baseOfQ;
            baseOfQ = baseOfQ + baseOfP;
        }
    }

    public int findBase(int index){
        int t = index;
        while(t != arr[t]){
            t = arr[t];
        }
        return t;
    }

}