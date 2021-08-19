package crackingCodingInterview.linkedLists;

public class kthtolast {
    public static void main(String[] args) {
        
    }
  public static Node partition(Node head, int x){
       Node smallNode =new Node(0);
       Node bigNode=new Node(0);
       Node small=smallNode;
       Node big=bigNode;
            while(head!=null){
                if(head.data<x){
                    smallNode.next=head;
                    smallNode=smallNode.next;
                }
                else{
                    bigNode.next=head;
                    bigNode=bigNode.next;
                }
                head=head.next;
            }
            bigNode.next=null;
            smallNode.next=big.next;
        }
        return small.next;

    }
  

