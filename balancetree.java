class balancetree{
    public static boolean isbalance(Node root){
        return isheight(root)!=1;
    }

    public static int isheight(Node root){
        if(root==null)return 0;
        int left=isheight(root.left);
        if(left==-1)return -1;
        int right=isheight(root.right);
        if(right==-1)return -1;
        if(Math.abs(left-right)>1)return -1;
        return Math.max(left,right)+1;
    }

    public static void main(String[] args) {
        
    }
}