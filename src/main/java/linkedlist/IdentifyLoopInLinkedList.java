package linkedlist;

public class IdentifyLoopInLinkedList{
    public Node middleNode(Node head) {
        if(head==null)return null;
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next; 
        }
        return slow;
    }

    
}