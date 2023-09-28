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



//using two stack => one stack push node root and then push that left and right into that and then pop the top element to second stack.

class postorderit{
    public static List<Integer>postorder(Node root){
        Stack<Node>s1=new Stack();
        Stack<Node>s2=new Stack();
        List<Integer>result=new ArrayList<>();
        s1.push(root);

        while(!s1.isEmpty()){
            Node cur= s1.pop();
            s2.push(cur);
            if(cur.left!=null)s1.push(cur.left);
            if(cur.right!=null)s2.push(cur.right);
        }
        while(!s2.isEmpty()){
            result.add(s2.pop().data);
        }
        return result;

    }
}