import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int val){
        data=val;
        right=null;
        left=null;
    }
}

class iterativeinorder{
    public static List<Integer>preorder(Node root){

        List<Integer>result=new ArrayList<>();
        Stack<Node>st=new Stack();
        st.push(root);
        while(!st.isEmpty()){
            root=st.pop();
            result.add(root.val);
            if(root.right!=null){
                st.push(root.right);
            }
            if(root.left!=null){
                st.push(root.left);
            }
        }
        return result;

    }
    public static void main(String[] args) {
                

        Node r=new Node(5);
        r.left=new Node(4);
        r.right=new Node(12);
        r.left.left=new Node(3);
        r.left.right=new Node(11);
                

    }
}