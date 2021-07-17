public class linked {
    public static void main(String[] args){
        Node head=new Node(101);
        head.next=new Node(3);
        head.next.next=new Node(45);
        head.next.next=new Node(234);
        //insertEnd(head, 78);
        middle(head);
       // printList(head);
       
    }
    private static Node middle(Node head){
        if(head==null){
            return null;
        }
        int count=0;
        for(Node curr=head;curr!=null;curr=curr.next){
                count++;
                curr=head;
        
        for(int i=0;i<count/2;i++){
            curr=curr.next;
        }
        System.out.println(curr.data);
    }
    return null;

    }
    public static void printList(Node head){
            if(head==null){
                return;
            }
            System.out.println(head.data+" ");
            printList(head.next);
        }


    private static Node insertBegin(Node head, int i) {
        Node temp= new Node(i);
        temp.next=head;
        head=temp;
        
        return head;
        
    }
   

    private static Node Deletefirst(Node head){
         if(head==null){
             return null;

         }
        Node temp=head;
        head=head.next;
        temp.next=null;
        return null;
 }

    private static Node insertPos(Node head, int pos, int x){
                    Node temp= new Node(x);
                    if(pos==1){
                        temp.next=head;
                        return temp;
                    }
                    Node curr=head;
                    for(int i=0;i<pos-2&&curr!=null;i++){
                        curr=curr.next;
                    }
                    if(curr==null){
                        return head;
                    }
                    temp.next=curr.next;
                    curr.next=temp;
                    return head;
            }


    private static Node insertEnd(Node head,int x){
           Node temp= new Node(x);
           if(head==null)
          { 
              return temp;
          }
          Node curr=head;
          while(curr.next!=null){
              curr=curr.next;
          }
          curr.next=temp;
          return head;


        }
    private static Node deleteLast(Node head)
        {
            if(head==null){
                return null;
            }
            Node curr=head;
            while(curr.next.next!=null){
                curr=curr.next;
            }
            curr.next=null;
            return head;
        }

    

private static void middleElementBySlowFast(Node head) {
    Node slow= head;
    Node fast=head;
    while(fast!=null&&fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    System.out.println(slow.data);
    
}
}
  //class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
       

    }
}


   









