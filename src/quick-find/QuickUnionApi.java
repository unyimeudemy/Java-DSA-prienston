public class QuickUnionApi{
    private int[] arr;
    static int counter = 0;



    public QuickUnionApi(int N){
        arr = new  int[N];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i;
        }
    }

    public static void main(String[] args){
        QuickUnionApi QUI = new QuickUnionApi(10);
        QUI.union(2, 3);
        QUI.union(3, 6);
        QUI.union(6, 8);
        System.out.println(QUI.isConnected(8, 2));
        // System.out.println(QUI.isConnected(2, 1));
        //  System.out.println("counter: "+ counter);
    }

    public boolean isConnected(int p, int q){
        return findBase(p) == findBase(q);
    }

    public void union (int p, int q){
        int baseOfP = findBase(p);
        int baseOfQ = findBase(q);
        arr[baseOfP] = baseOfQ;
    }

    public int findBase(int index){
        int t = index;
        while(t != arr[t]){
            t = arr[t];
        }
        return t;
    }

}