import java.util.*;

public class reverse{
            public static void main(String[] args){
                Node head=new Node(30);
                head.next=new Node(45);
                head.next.next=new Node(68);
                head.next.next.next=new Node(76);
                reverseList(head);
                print(head);

            }

            public static Node reverseList(Node curr,Node prev){
             if(curr=null){
                return prev;
             }

               
            }
           public static void print(Node head){
               if(head==null){
                   return;
               }
               Node curr=head;
               while( curr!=null){
                   System.out.println(curr.data+" ");
                   print(head.next);
               }

           }

   
}
