// import java.util.Arrays;

// public class Stacks{
//     String[] stringArray;
//     int top;
//     int arraySize;


//     public Stacks(int size){
//         top = -1;
//         arraySize = size;
//         stringArray = new String[arraySize];
//     }

//     public void push(String word){
//         stringArray[++top] = word;
//     }

//     public String pop(){
//         return stringArray[top--];
//     }

//     public String peek(){
//         return stringArray[top];
//     }

//     public boolean isEmpty(){
//         return top == -1;
//     }

//     public boolean isFull(){
//         return  top == arraySize;
//     }

//     @Override
//     public String toString(){
//         return Arrays.toString(stringArray);
//     }

//     public static void main(String[] args){
//         Stacks arrayStack = new Stacks(6);
//         arrayStack.push("ikeja");
//         arrayStack.push("electric");
//         arrayStack.push("lagos");
//         arrayStack.push("nigeria");
//         System.out.println(arrayStack.pop());
//     }
// }

//********************************************************************************** */

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Stacks {
    public static void main(String[] args) {
        Implementation<String> arrayStack = new Implementation<>(6);
        arrayStack.push("ikeja");
        arrayStack.push("electric");
        arrayStack.push("lagos");
        arrayStack.push("nigeria");
        // arrayStack.displayList();

        Iterator<String> iterator = arrayStack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Alternatively, you can use a for-each loop
        // for (String item : arrayStack) {
        //     System.out.println(item);
        // }
    }
}

class Implementation<T> implements Iterable<T> {
    private T[] stringArray;
    private int top;
    private int arraySize;

    public Implementation(int size) {
        top = -1;
        arraySize = size;
        stringArray = (T[]) (new Object[arraySize]);
    }

    public void push(T word) {
        stringArray[++top] = word;
    }

    public T pop() {
        return stringArray[top--];
    }

    public T peek() {
        return stringArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == arraySize;
    }

    public void displayList() {
        for (T item : stringArray) {
            System.out.println(item);
        }
    }

    @Override
    public Iterator<T> iterator() {
        List<T> list = Arrays.asList(stringArray);
        return list.iterator();
    }

}
