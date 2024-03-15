public class doublylistinsmid {
    Node head ,tail;

    doublylistinsmid(){
        head = tail = null;
    }
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public  void create(int data){
        Node n = new Node(data);
        if(head == null){
           tail = head = n;
        }
        else{
            n.prev = tail;
            tail.next = n;
            tail = n;
        }
    }
    public void print(Node head){
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            while (head!=null) {
                System.out.println(head.data);
                head = head.next;
            }
        }
    }
    public void mid(int data){
        if(head == null){
            System.out.println("list is empty");
        }
        else{
            Node fast = head;
            Node slow = head;
            while(fast!= null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
            }
            Node n = new Node(data);
            n.next = slow;
            n.prev  = slow.prev;
            slow.prev.next = n;
            slow.prev = n;
        }
    }
    public static void main(String[] args) {
        doublylistinsmid l = new doublylistinsmid();
        l.create(2);
        l.create(3);
        l.create(5);
        l.create(7);
        // l.create(8);
        l.print(l.head);
        System.out.println();
        l.mid(0);
        l.print(l.head);
    }
}
