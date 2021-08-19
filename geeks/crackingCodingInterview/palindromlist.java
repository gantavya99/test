package crackingCodingInterview;

public class palindromlist {
    public static void main(String[] args) {
        Node head=new Node(30);
        head.next=new Node(40);
        head.next.next=new Node(78);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(30);
    }
   
    static Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        
        while(curr!=null){
            Node next=head.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
