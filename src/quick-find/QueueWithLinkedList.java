
// public class QueueWithLinkedList {

//     public static void main(String[] args){
//         LinkedList myList = new LinkedList();

//         myList.enqueue(2);
//         myList.enqueue(5);
//         myList.enqueue(3);
//         myList.dequeue();
//         myList.getList();
    
//     }

// }

// class LinkedList{
//     private Link head;
//     private Link tail;
//     public LinkedList(){
//          head = null;
//          tail = null;
//     }


//     public void enqueue(int data){
//         Link newLink = new Link(data);
//         if(head == null){
//             head = newLink;
//             tail = newLink;
//         }else{
//             tail.next = newLink;
//             tail = newLink;
//         }
//     }

//     public int dequeue(){
//         Link temp = head;
//         if(head == null){
//             tail = null;
//             throw new IllegalStateException("Queue is empty");
//         }
//         head = head.next;
//         return temp.getLinkData();
//     }

//     public void getList(){
//         Link current = head;
//         while(current != null){
//             System.out.println(current.getLinkData());
//             current = current.next;
//         }
//     }
// }

//  class Link {
//     private int linkData;
//     public Link next;

//     public Link (int data){
//         linkData = data;
//         next = null;
//     }

//     public int getLinkData(){
//         return linkData;
//     }
// }

//************************** WITH GENERICS  **************************************************************************** */


// public class QueueWithLinkedList {

//     public static void main(String[] args){
//         // LinkedList<Integer> myList = new LinkedList<>();
//         // myList.enqueue(2);
//         // myList.enqueue(5);
//         // myList.enqueue(3);
//         // myList.enqueue(10);
//         // myList.dequeue();
//         // myList.getList();

//         LinkedList<String> myStringList = new LinkedList<>();
//         myStringList.enqueue("unyime");
//         myStringList.enqueue("emmanuel");
//         myStringList.enqueue("udoh");
//         myStringList.enqueue("williams");
//         myStringList.dequeue();
//         myStringList.getList();
//     }
// }

// class LinkedList <T> {
//     private Link<T> head;
//     private Link<T> tail;
//     public LinkedList(){
//          head = null;
//          tail = null;
//     }


//     public  void enqueue(T data){
//         Link<T> newLink = new Link<>(data);
//         if(head == null){
//             head = newLink;
//             tail = newLink;
//         }else{
//             tail.next = newLink;
//             tail = newLink;
//         }
//     }

//     public T dequeue(){
//         Link<T> temp = head;
//         if(head == null){
//             tail = null;
//             throw new IllegalStateException("Queue is empty");
//         }
//         head = head.next;
//         return (T)temp.getLinkData();
//     }

//     public void getList(){
//         Link<T> current = head;
//         while(current != null){
//             System.out.println(current.getLinkData());
//             current = current.next;
//         }
//     }
// }

//  class Link <T> {
//     private T linkData;
//     public Link<T> next;

//     public Link (T data){
//         linkData = data;
//         next = null;
//     }

//     public T getLinkData(){
//         return linkData;
//     }
// }

//********************************* WITH ITERATORS  ********************************************************************* */

import java.util.Iterator;


public class QueueWithLinkedList {
    public static void main(String[] args){


        LinkedList<String> myStringList = new LinkedList<>();
        myStringList.enqueue("unyime");
        myStringList.enqueue("emmanuel");
        myStringList.enqueue("udoh");
        myStringList.enqueue("williams");
        myStringList.dequeue();
        // myStringList.getList();


        // Iterator<String> iterator = myStringList.iterator();
        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }

        for (String item : myStringList) {
            System.out.println(item);
        }
    }
}

class LinkedList  <T> implements Iterable<T> {
    private Link<T> head;
    private Link<T> tail;
    public LinkedList(){
         head = null;
         tail = null;
    }


    public  void enqueue(T data){
        Link<T> newLink = new Link<>(data);
        if(head == null){
            head = newLink;
            tail = newLink;
        }else{
            tail.next = newLink;
            tail = newLink;
        }
    }

    public T dequeue(){
        Link<T> temp = head;
        if(head == null){
            tail = null;
            throw new IllegalStateException("Queue is empty");
        }
        head = head.next;
        return (T)temp.getLinkData();
    }

    public void getList(){
        Link<T> current = head;
        while(current != null){
            System.out.println(current.getLinkData());
            current = current.next;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Link<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                T data = current.getLinkData();
                current = current.next;
                return data;
            }
        };
    }

}

 class Link <T> {
    private T linkData;
    public Link<T> next;

    public Link (T data){
        linkData = data;
        next = null;
    }

    public T getLinkData(){
        return linkData;
    }
}

