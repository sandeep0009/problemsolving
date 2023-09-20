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

class Heightoftree{
    public static int height(Node root){
        if(root==null)return 0;
        int lheight=height(root.left);
        int rheight=height(root.right);
        if(lheight>rheight)return lheight+1;
        return rheight+1;
    }

    public static void main(String[]args){
        Node root=new Node(3);
        root.left=new Node(2);
        root.right=new Node(1);
        root.left.left=new Node(12);
        System.out.println(height(root));
    }
}