public class LinkedList {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    static int size = 0;

    // ADD FIRST
    public void addFirst(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    // ADD LAST 
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            size++;
            return;

        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }
    // add in middle
    public void addInMiddle(int index,int data){
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;
        if (index == 0) {
            addFirst(data);
            size++;
            return;
        }
        while(i<index-1){
            temp = temp.next;
            i++;
        }
        // now i = index-1 and node = previous node 
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }
    // print a linked list
    public static void printLinkedList(){
        Node temp = head;
        while (temp!= null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
        if(head == null){
            System.out.println("Linked List is empty");
        }
    }
    public int linearIterativeSearch(int target){
        Node temp = head;
        int index = 0;
        while(temp!= null){
            if (temp.data == target) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }
    public int helper(Node head,int target){
        if(head == null){
            return -1;
        }
        if (head.data == target) {
            return 0;
        }
        int index = helper(head.next, target);
        if (index == -1)  {
            return -1;
        }
        return index + 1;
    }
    public int recursiveSearch(int target){
        return helper(head,target);
    }
    public int removefirst(){
    //    special casse
    if(size == 0){
        return Integer.MIN_VALUE;
    }
    else if(size==1){
        int val = head.data;
        head = tail = null;
        size--;
        return val;
    }
        int val = head.data;
        head  = head.next;
        size--;
        return val;
    }
    public int removelast(){
        // special case
        if (size == 0) {
            return -1;
        }
        else if (size ==1) {
            int val = tail.data;
            head = tail = null;
            size--;
            return val;
        }
        Node temp = head;
        for (int i = 0; i < size-2; i++) {
          temp = temp.next;
        } 
        int val = temp.next.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }
    // iterative
    public static void reverseLL(){ //O(n)
    Node prev = null;
    Node curr = tail = head;
    Node next;
    while (curr != null) {
        next  = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    head = prev;

}
    public void reverseRec(Node node){
        if (node == tail) {
            head = tail;
            return;
        }
        reverseRec(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }
    // in place 
// find and remove nth node from end
public static void removenthfromlast(int n){
    int sz = 0;
    Node temp = head;
    while (temp!=null) {
        temp = temp.next;   
        sz++;
    }
    if (n==sz) {
        head = head.next;
        return;
    }
    // sz-n
    int i = 1;
    int itofind = sz-n;
    Node prev = head;
    while (i<itofind) {
        prev = prev.next;
        i++;
    }
    prev.next = prev.next.next;
    return;
}
// check palindrome
// slowfast concept
// half reverse
public boolean palindrome(){
    if (head == null ||head.next == null) {
        return true;
    }
    // step1 find mid
    Node mid = mid(head);
    // reverse 2nd half
    Node prev = null;
    Node curr = mid;
    Node next;
    while (curr!=null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    Node right = prev;
    Node left = head;
    // step3 check left and right half
    while (right!=null) {
        if (left.data != right.data) {
            return false;
        }
        left = left.next;
        right = right.next;

    }
    return true;
}
// check loop or cycle in LL
// loop in ll - slow and fast pointer meet  at other than head
public boolean isCycle(){
    Node slow = head;
    Node fast = head;
    while (fast != null || fast.next !=null) {
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast ){
            return true;
        }
    }
    return false;
}

// doesnt work if cycle is at head
public static void removecycle(){
    Node slow = head;
    Node fast = head;
    boolean cycle = false;
    while (fast != null || fast.next !=null) {
        slow = slow.next;
        fast = fast.next.next;
        if(fast == slow){
            cycle = true;
            break;
        }   
    }
    if(cycle == false ){
        return;
    } 
    slow = head;
    Node prev = null;
    while (slow!=fast) {
        prev = fast;
        slow = slow.next;
        fast = fast.next;
    }
    prev.next = null;
}
public Node merge(Node head1,Node head2){
    Node mergeLL = new Node(-1);
    Node temp = mergeLL;
    
    while (head1!=null&&head2!=null) {
        if (head1.data<=head2.data) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }else{
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
    }
    while (head1!= null) {
        temp.next = head1;
        head1 = head1.next;
        temp = temp.next;
    }
    while (head2!=null) {
        temp.next = head2;
        head2 = head2.next;
        temp = temp.next;
    }
    return mergeLL.next;
}
public Node mergeSort(Node head){
    if (head== null || head.next == null) {
        return head;
    }
    Node mid = mid(head);
    Node rightHead = mid.next;
    mid.next = null;
    Node newLeft = mergeSort(head);
    Node newRight = mergeSort(rightHead);
    return merge(newLeft,newRight);
}


public Node mid(Node head){
    if (head == null)
            return null;
   Node slow = head;
   Node fast = head.next;
   while (fast != null && fast.next !=null) {
    slow = slow.next;
    fast = fast.next.next;
   }
   return slow; 
}
public void zigzag(){
    // find mid
    Node mid = mid(head);
    // reverse 2nd half
    Node curr = mid.next;
    mid.next = null;
    Node prev = null;
    Node next;
    while (curr!=null) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    Node left = head;
    Node right = prev;
    Node nextl,nextr;
    // alt merge -zig - zag merge
    while (left!=null && right !=null) {
        nextl  = left.next;
        left.next = right;
        nextr = right.next;
        right.next = nextl;
        left  = nextl;
        right = nextr;

    }
}
public void insertRec(int index,int data){
    head = insertRec(index, data,head);
}
public Node insertRec(int index, int data,Node node){
    if (index == 0) {
        Node temp = new Node(data);
        temp.next = node;
        size++;
        return temp;
    }
    node.next = insertRec(index-1, data, node.next);
    return node;
}


public static void main(String[] args) {
    LinkedList LL = new LinkedList();
    // LL.addFirst(1);
    // LL.addFirst(2);
    // // printLinkedList();
    // LL.addLast(3);
    LL.addLast(1);
    LL.addLast(2);
    LL.addLast(3);
    LL.addLast(4);
    LL.addLast(5);
    // LL.insertRec(2,88);
        // head.next.next.next.next.next = head;
        // LL.addInMiddle(3, 10);
        printLinkedList(); 
        // System.out.println(LL.palindrome());
        // printLinkedList(); 
        // System.out.println(LL.size);
        // System.out.println(LL.linearIterativeSearch(10));
        // System.out.printl6n(LL.recursiveSearch(4));
        // LL.removelast();insertRec
        // LL.removefirst();
        // printLinkedList();
        // reverseLL();
        // removenthfromlast(3);
        // printLinkedList();
        // System.out.println(LL.isCycle());
        // removecycle();
        // System.out.println(LL.isCycle());
        // head = LL.mergeSort(head);
        LL.zigzag();
        LL.printLinkedList(); 
    }
}
