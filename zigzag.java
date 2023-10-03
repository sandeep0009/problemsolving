import java.util.*;
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


class zigzag{
    public static List<List<Integer>> Zig(Node root){
        List<List<Integer>>result=new ArrayList<>();
        Queue<Node>q=new LinkedList<>();
        q.offer(root);
        boolean flag=false;
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer>sub=new ArrayList<>();
            Stack<Integer>s=new Stack();
            for(int i=0;i<size;i++){
                Node node=q.poll();
                if(flag)s.push(node.data);
                else sub.add(node.data);

                if(node.left!=null)q.offer(node.left);
                if(node.right!=null)q.offer(node.right);
            }

            flag=!flag;

            while(!s.isEmpty())sub.add(s.pop());


            result.add(sub);

        }
        return result;

    }


    public static void main(String[] args) {
        Node r=new Node(5);
        r.left=new Node(4);
        r.right=new Node(12);
        r.left.left=new Node(3);
        r.left.right=new Node(11);
       
        System.out.println(  Zig(r));
    }
}