package trees;

import java.util.Stack;

public class traversal {
    public static void main(String[] args){
        
       Node root=new Node(10);
       root.left=new Node(30);
       root.left.left=new Node(40);
       root.right=new Node(33);
       root.right.left=new Node(56);
       preorderTraversalIterative(root);
      
       
    }
    static void Inorder(Node root){
        if(root!=null){
            Inorder(root.left);
            System.out.println(root.key);
            Inorder(root.right);
        }
    }
    static int getSize(Node root){
        if(root==null){
            return 0;
        }
        return 1+getSize(root.left)+getSize(root.right);
    }
    static int getMax(Node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        else
        return Math.max(root.key, Math.max(getMax(root.left),getMax(root.right)));
    }
    static int getHeight(Node root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(getHeight(root.left),getHeight(root.right));
    }
    static void inOrderTraversalIterative(Node root){
        Stack<Node> st= new Stack<Node>();
        Node curr= root;
        while(curr!=null||st.empty()==false){
            while(curr!=null){
                st.push(curr);
                curr=root.left;
            }
            curr=st.pop();
            System.out.println(curr.key+" ");
            curr=curr.right;
        }
    }
    static void preorderTraversalIterative(Node root){
        Stack<Node> st = new Stack<Node>();
        st.push(root);
        if(root==null){
            return;
        }
        while(st.isEmpty()==false){
            Node curr=st.pop();
            System.out.println(curr.key+" ");
            if(curr!=null){
                st.push(curr.right);
            }
            if(curr!=null){
                st.push(curr.left);
            }

        }
        

        
    }
}

class Node{
    int key;
    Node left;
    Node right;
    Node(int k ){
        key=k;
    }
}
// class binaryTree{
//     Node root;
//     binaryTree(){
//         root=null;
//     }

// }
