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

class inordertraversal{
    public static void inorder(Node root,List<Integer>re){
        if(root==null)return;
        inorder(root.left, re);
        re.add(root.data);
        inorder(root.right, re);

    }
    public static void main(String[] args) {
        Node root=new Node(4);
        root.left=new Node(1);
        root.right=new Node(12);
        root.left.left=new Node(34);
        List<Integer>re=new ArrayList<>();
        inorder(root,re);
        System.out.println(re);
    }
}