import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int val){
        this.data=val;
        this.left=null;
        this.right=null;
    }
}


public class preordertraversal {
    public static void preorder(Node root,List<Integer>r){
        if(root==null)return;
        r.add(root.data);
        preorder(root.left, r);
        preorder(root.right, r);
    }

    public static void main(String[] args) {
        Node root=new Node(23);
        root.left=new Node(12);
        root.right=new Node(20);
        root.right.left=new Node(12);
        root.right.right=new Node(20);

        List<Integer>re=new ArrayList<>();

        preorder(root, re);
        System.out.println(re);
        
    }
    
}
