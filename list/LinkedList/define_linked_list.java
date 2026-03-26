class Node {
    int values;

    Node next;

    
}
public class define_linked_list{
    public static void main(String[] args) {
        Node node1=new Node();
        Node node2=new Node();
        Node node3=new Node();
        node1.values=2;
        node1.next=node2;
        node2.values=4;
        node2.next=node3;
        node3.values=5;
        node3.next=null;
    }
}

