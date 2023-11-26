
public class SinglyLinkedList {
    public static void main (String[] args){
        LinkList myList = new LinkList();


        // System.out.println(myList.isEmpty());
        myList.insertAtHead(3);
        myList.insertAtHead(4);
        myList.insertAtHead(5);
        // myList.deleteLink(3);
        // System.out.println(myList.getFirstLink().linkData);
        myList.displayList();
    }

}


class LinkList {
    Link head;
    Link empLink = new Link(-1);

    public LinkList(){
        head = null;
        empLink.next = null;
    }

    public void insertAtHead(int dataToInsert){
        Link LinkToInsert = new Link(dataToInsert);
        LinkToInsert.next = head;
        head = LinkToInsert;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public Link deleteFromHead(){
        Link linkToDelete = head;
        head = head.next;
        return linkToDelete;
    }

    public void displayList(){
        Link current = head;

        while(current != null){
            current.displayLinkData();
            current = current.next;
        }
    }

    public Link getLink(int linkData){
        Link current = head;
        while (current.returnLinkData() != linkData){
        if(current.next == null){
            System.out.println("link not found");
            return null;
        }else{
            current = current.next;
        }
        }
        return current;
    }

    // public Link getLink(int linkData){
    //     Link current = head;
    //     while (current.returnLinkData() != linkData){
    //         current = current.next;
    //     }

    //     if(current.next == null){
    //         System.out.println("link not found");
    //         return empLink;
    //     }else{

    //         return current;
    //     }
    // }

    public Link getFirstLink(){
        return head;
    }

    public Link deleteLink(int linkData){
        Link current = head;
        Link previous = head;

        while(current.linkData != linkData){
            previous = current;
            current = current.next;
        }

        previous.next =  current.next; 
        return current;

    }

    class Link {
    int linkData;
    Link next;

    public Link(int data){
        linkData = data;
    }

    public void displayLinkData(){
        System.out.println("Link data: " + linkData);
    }

    public int returnLinkData(){
        return linkData;
    }
}

}


