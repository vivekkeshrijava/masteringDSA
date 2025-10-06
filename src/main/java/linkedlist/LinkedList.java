package linkedlist;

public class LinkedList {
    Node head;
    Node tail;
    int length;

    LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void getHead(){
        if(head == null){
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail(){
        if(tail == null){
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength(){
        System.out.println("Length: " + length);
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast(){
        if(length == 0) return null;
        Node temp = head;
        Node pre = head;
        while(temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if(length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst(){
        if(length == 0) return null;
        Node temp = head;
        head = head.next;   
        temp.next = null;
        length--;
        if(length == 0){
            head = null;
            tail = null;        
        }
        return temp;
    }

    public Node get(int index){
        if(index < 0 || index >= length) return null;
        Node temp = head;
        for(int i=0; i<index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value){
        Node temp = get(index);
        if(temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value){
        if(index < 0 || index > length) return false;
        if(index == 0){
            prepend(value);
            return true;
        }
        if(index == length){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public Node remove(int index){
        if(index < 0 || index >= length) return null;
        if(index == 0) return removeFirst();
        if(index == length - 1) return removeLast();
        Node prev = get(index - 1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for(int i=0; i<length; i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    public Node findMiddleNode(){
        if(head == null) return null;
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node reverseBetween(Node head, int left, int right) {
        if (head == null || left == right) return head;

        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
    
        // Move prev to the node before the sublist
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }
    
        Node curr = prev.next;
        Node next = null;
    
        // Reverse the sublist
        for (int i = 0; i < right - left; i++) {
            next = curr.next;
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }
    
        // Update head if needed
        head = dummy.next;
        return head;
    }



    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(10);
        myLinkedList.append(5);
        myLinkedList.append(16);
        myLinkedList.printList();
        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast().value);
        myLinkedList.prepend(20);
        myLinkedList.prepend(40);
        myLinkedList.printList();
        myLinkedList.removeFirst();
        myLinkedList.printList();
        myLinkedList.removeLast();
        myLinkedList.printList();
        myLinkedList.append(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);
        myLinkedList.printList();
        myLinkedList.reverseBetween(myLinkedList.head, 2, 4);
        myLinkedList.printList();
        System.out.println(myLinkedList.length);
    }
}