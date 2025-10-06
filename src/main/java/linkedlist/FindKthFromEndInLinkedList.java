package linkedlist;

public class FindKthFromEndInLinkedList{
    // Find the k-th node from the end using two pointers
    public Node findKthFromEnd(Node head, int k) {
        if (head == null || k <= 0) return null;
        Node first = head;
        Node second = head;
        // Move first pointer k steps ahead
        for (int i = 0; i < k; i++) {
            if (first == null) return null; // k is larger than the length of the list
            first = first.next;
        }
        // Move both pointers until first reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        return second;
    }

    
}