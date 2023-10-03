class Node{
    int data;
    Node left;
    Node right;

    Node(int val){
        this.data=val;
        this.right=null;
        this.left=null;
    }
}

class maxpathsum{
    public static int maxpath(Node root){
        int[]maxi=new int[1];
        maxi[0]=Integer.MIN_VALUE;
        height(root,maxi);
        return maxi[0];
    }

    public static int height(Node root,int[]maxi){
        if(root==null)return 0;
        int left=Math.max(0,height(root.left,maxi));
        int right=Math.max(0,height(root.right,maxi));
        maxi[0]=Math.max(maxi[0],left+right+root.data);
        return Math.max(left,right)+root.data;

    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(20);
        root.right.left=new Node(15);
        root.right.right=new Node(7);
        System.out.println(maxpath(root));
    }
}