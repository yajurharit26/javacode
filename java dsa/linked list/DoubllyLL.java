public class DoubllyLL {
    public class Node {
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size = 0 ;
    public void addfirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;

            size++;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        size++;
    }
    public  void print(){
        Node temp = head;
        System.out.print("null <-> ");
        while(temp!=null){
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public int removeLast(){
        if (head == null) {
            System.out.println("DLL is emplt");
            return 0;
        }
        if (size == 1) {
            int val = tail.data;
            tail = head = null;
            size--;
            return val;
        }
        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }
    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;
        while (curr!=null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }head = prev;
    }
    public static void main(String[] args) {
        DoubllyLL dll = new DoubllyLL();
        dll.addfirst(3);
        dll.addfirst(2);
        dll.addfirst(1);
        // System.out.println(dll.size);
        dll.print();
        // dll.removeLast();
        // System.out.println(dll.size);
        dll.reverse();

        dll.print();
    }
}
