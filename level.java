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

class level{
    public static List<List<Integer>> levelorder(Node root){
        Queue<Node>qu=new LinkedList<>();
        List<List<Integer>> wr=new ArrayList<>();

        if(root==null)return wr;
        qu.offer(root);
        while(!qu.isEmpty()){
            int le=qu.size();
            List<Integer>su=new ArrayList<>();
            while(le-->0){
                Node cu=qu.poll();
                su.add(cu.data);
                if(cu.left!=null)qu.offer(cu.left);
                if(cu.right!=null)qu.offer(cu.right);

            }
            wr.add(su);
        }

        return wr;

    }


    public static void main(String[]args){
        Node r=new Node(5);
        r.left=new Node(4);
        r.right=new Node(12);
        r.left.left=new Node(3);
        r.left.right=new Node(11);
       
        System.out.println( levelorder(r));
    }
}