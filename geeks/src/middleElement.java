public class middleElement {
    public static void main(String[] args){
        Node head =new Node(20);
        head.next= new Node(30);
        head.next.next=new Node(567);
        head.next.next.next=new Node(656);
        findingNthNodeFromEnd(head, 2);
    }
    private static void reverseList(Node head){
        
    }

        private static void printList(Node head){
            if(head==null){
                return;
            }
            System.out.println(head.data+" ");
            printList(head.next);
        }
        private static void middle(Node head) {
            Node slow=head;
            Node fast=head;
            while(fast!=null&&fast.next!=null){
                slow=head.next;
                fast=head.next.next;
            }
            System.out.println(slow.data);

        }
        private static void findingNthNodeFromEnd(Node head, int n){
            Node first=head;
            for(int i=0;i<n;i++){
                if(first==null){
                    return;
                }
                first=first.next;
            }
            Node second=head;
            while(first!=null){
               first= first.next;
              second= second.next;
            }
            System.out.println(second.data);
        }
}
class Node
{
    int data;
    Node next;
    Node(int x){
       data= x;
       next=null;
    }
}

