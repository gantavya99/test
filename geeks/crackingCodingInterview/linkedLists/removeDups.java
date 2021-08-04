package crackingCodingInterview.linkedLists;
import java.util.*;
public class removeDups {
    public static void main(String[] args) {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=new Node(6);
        head.next.next.next.next.next.next=new Node(7);
      push(67899, head);
        printList(head);
        
        

    }        
  static void removeDuplicate(Node head){
   HashSet<Integer>s=new HashSet<Integer>();
        Node curr=head;
            while(curr!=null){
                s.add(curr.data);
                curr=curr.next;
            }
            for(int i:s){
                System.out.println(i);
            }
   }    
  
  static void printList(Node head){
      Node curr=head;
      while(curr!=null){
          System.out.println(curr.data+" ");
          curr=curr.next;
      }
  }
  
  static int kthLastNode(Node head, int k){
      Node curr=head;
      
      int count=0;
      while(curr!=null){
          count++;
          curr=curr.next;
      }
      for(int i=0;i<count-k+1;i++){
         
            curr=curr.next;
      }
      return curr.data;
  }
  static Node deleteMiddle(Node head){
      if(head==null){
          return null;
      }
      Node slow=head;
      Node fast=head;
      Node prev=null;
      
      while(fast!=null&&fast.next!=null){
          slow=slow.next;
          fast=fast.next.next;
          prev=slow;
      }
      prev.next=slow.next;
      return head;
  }
  static Node push(int x,Node head){
    Node newNode=new Node(x);
    newNode.next=head;
    head=newNode;
    return head;
  }
















  
  
  
   static void deleteDups(Node head){
    Node curr=head;
    
    while(curr!=null){
        Node runner =curr;
        while(runner.next!=null){
            if(curr.data==runner.next.data){
                runner.next=runner.next.next;
            }
            runner=runner.next;
        }
        curr=curr.next;
    }


   }
}
 class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
