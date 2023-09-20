import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
     Node(int val){
        data=val;
        left=null;
        right=null;
    }
}

class Nodewithonechild{
   public static void inorder(Node root,List<Integer>r){
    if(root==null)return;
    inorder(root.left,r);
    r.add(root.data);
    inorder(root.right, r);

   }


   public static void Treenodewithonechild(Node root){
    if(root==null)return;
    if ((root.left == null && root.right != null) || (root.left != null && root.right == null)) {
        System.out.println("Node with one child: " + root.data);
    }
   }
   public static void main(String[]args){
    Node r=new Node(5);
    r.left=new Node(3);
    r.left.left=new Node(4);
    r.left.right=new Node(1);
    r.right=new Node(2);
    r.right.right=new Node(4);
    Treenodewithonechild(r);
    List<Integer>re=new ArrayList<>();
    inorder(r, re);
    System.out.println(re);


   }
}
