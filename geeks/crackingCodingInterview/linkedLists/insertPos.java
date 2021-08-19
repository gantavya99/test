package crackingCodingInterview.linkedLists;
import java.util.*;
public class insertPos {
    public static void main(String[] args) {
       Node head=new Node(30);
        head.next=new Node(98);
       head.next.next=new Node(876);
       head.next.next.next=new Node(12);
       head.next.next.next.next=new Node(9);
      insertpos(head,2,-890);
       printList(head);
    
      
   
    }
    static void printList(Node head){
        if(head==null){
            return;
        }
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
    }
    static void insetPositionAfterNode(Node m, int data){
        if(m==null){
            return;
        }
        Node temp=new Node(data);
        temp.next=m.next;
        m.next=temp;
    }
    static Node insertpos(Node head, int pos, int data){
       Node temp=new Node(data);
       if(head==null){
           return null;
       }
       Node curr=head;
           for(int i=0;i<pos-1;i++){
            curr=curr.next;
           }
           temp.next=curr.next;
           curr.next=temp;
           return head;
       }
    
    static Node insertEnd(Node head, int data){
        Node temp=new Node(data);
        if(head==null){
            return temp;
        }
        Node curr=head;
        
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=temp;
        return head;
    }
   

}   

