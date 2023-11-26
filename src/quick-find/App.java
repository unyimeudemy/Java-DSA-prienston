import java.io.*;



public class App {
    private int[] arr;

    public App(int N){
        arr = new int[N];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i;
        }
    }
   
    public boolean connected(int a, int b){
        return arr[a] == arr[b];
    }

    public void union(int a, int b){
        int valueAtb = arr[b];
        int valueAta = arr[a];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == valueAta){
                arr[i] = valueAtb;
            }
        }
    }

    public static void main(String[] args){

        App instance = new App(10);
        System.out.println(instance.connected(2, 3));
        instance.union(2, 3);
        System.out.println(instance.connected(2, 3));

    }
}
