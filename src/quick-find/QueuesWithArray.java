// import java.util.Arrays;

// public class QueuesWithArray {
//     public static void main (String[] args){
//         QueueImplementation myQueue = new QueueImplementation(4);
//         myQueue.enqueue(2);
//         myQueue.enqueue(3);
//         myQueue.enqueue(5);
//         System.out.println(Arrays.toString(myQueue.getQueue()));
//         System.out.println(myQueue.dequeue());
//         System.out.println(Arrays.toString(myQueue.getQueue()));
//     }
    
// }

// class QueueImplementation {
//     private int[] numArr;
//     private int front;
//     private int back;
//     private int queueLength;

//     public QueueImplementation(int arrSize){
//         numArr = new int[arrSize];
//         front = 0;
//         back = -1;
//         queueLength = 0;
//     }

//     public void enqueue(int data){
//         if(back == numArr.length - 1){
//             back = -1;
//         }
//         numArr[++back] = data;
//         queueLength++;
//     }

//     public int dequeue(){
//         System.out.println("front before increment: " + front);
//         int temp = numArr[front++];
//         System.out.println("front after increment: " + front);
//         if(front == numArr.length - 1){
//             front = 0;
//         }
//         queueLength--;
//         return temp;
//     }

//     public int[] getQueue(){
//         return numArr;
//     }
// }


//****************************************************************************************************** */

// import java.util.Arrays;

// public class QueuesWithArray {
//     public static void main (String[] args){
//         QueueImplementation myQueue = new QueueImplementation(4);
//         myQueue.enqueue(2);
//         myQueue.enqueue(3);
//         myQueue.enqueue(5);
//         System.out.println(Arrays.toString(myQueue.getQueue()));
//         System.out.println(myQueue.dequeue());
//         System.out.println(Arrays.toString(myQueue.getQueue()));
//     }
    
// }

// class QueueImplementation <T> {
//     private T[] itemArray;
//     private T front;
//     private T back;
//     private T queueLength;

//     public QueueImplementation(T arrSize){
//         itemArray = new T[arrSize];
//         front = 0;
//         back = -1;
//         queueLength = 0;
//     }

//     public void enqueue(T data){
//         if(back == itemArray.length - 1){
//             back = -1;
//         }
//         itemArray[++back] = data;
//         queueLength++;
//     }

//     public T dequeue(){
//         System.out.println("front before increment: " + front);
//         int temp = itemArray[front++];
//         System.out.println("front after increment: " + front);
//         if(front == itemArray.length - 1){
//             front = 0;
//         }
//         queueLength--;
//         return temp;
//     }

//     public T[] getQueue(){
//         return itemArray;
//     }
// }

