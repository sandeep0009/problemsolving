import java.util.*;
class Node{
    int data;
    Node right;
    Node left;
    Node(int val){
        this.data=val;
        this.right=null;
        this.left=null;
    }
}

class Tuple{
    Node node;
    int row;
    int col;
    Tuple(Node n,int r,int c){
        this.node=n;
        this.row=r;
        this.col=c;
    }
}


class verticalOder{

    public static List<List<Integer>> vertical(Node root){
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>>map=new TreeMap<>();
        Queue<Tuple>q=new LinkedList<>();
        q.offer(new Tuple(root,0,0));
        while(!q.isEmpty()){
            Tuple t=q.poll();
            Node node=t.node;
            int x=t.row;
            int y=t.col;
            if(!map.containsKey(x)){
                map.put(x,new TreeMap<>());
            }

            if(!map.get(x).containsKey(y)){
                map.get(x).put(y,new PriorityQueue<>());
            }

            map.get(x).get(y).offer(node.data);

            if(node.left!=null) q.offer(new Tuple(node.left,x-1,y+1));
            if(node.right!=null)q.offer(new Tuple(node.right,x+1,y+1));


        }


        List<List<Integer>> result=new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>>y:map.values()){
            result.add(new ArrayList<>());
            for(PriorityQueue<Integer>nodes:y.values()){
                while(!nodes.isEmpty()){

                    System.out.println(nodes.peek());
                    result.get((result.size()-1)).add(nodes.poll());


                }
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


        List<List<Integer>> result = vertical(r);

        // Print the result
        for (List<Integer> list : result) {
            System.out.println(list);
        }       
    }
}