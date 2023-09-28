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
class inorderit{
    public static List<Integer> inorderit(Node root){

        List<Integer>result=new ArrayList<>();
        Stack<Node>s=new Stack();
        Node node=root;
      
        while(!s.isEmpty()){
            if(node!=null){
                s.push(node);
                node=node.left;
            }
            else{
                if(s.isEmpty())break;
                node=s.pop();
                result.add(node.data);
                node=node.right;
            }

        }
        return result;

    }
}