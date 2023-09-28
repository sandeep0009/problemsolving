import java.util.*;


class Node{
    int val;
    Node left;
    Node right;
    Node(int data){
        this.val=data;
        this.right=null;
        this.left=null;
    }
}

class Pair {
    Node node;
    int num;

    Pair(Node node, int num) {
        this.node = node;
        this.num = num;
    }
}
class alltraverse{
    public static void preinpost(Node root){
        List<Integer>pre=new ArrayList<>();
         List<Integer>post=new ArrayList<>();
          List<Integer>in=new ArrayList<>();

          Stack<Pair> s=new Stack<Pair>();
          s.push(new Pair(root,1));
          while(!s.isEmpty()){
            Pair it= s.pop();{
                if(it.num==1){
                    pre.add(it.node.val);
                    it.num++;
                    s.push(it);
                    if(it.node.left!=null){
                        s.push(new Pair(it.node.left,1));
                    }
                    
                }
                else if(it.num==2){
                    in.add(it.node.val);
                    it.num++;
                    s.push(it);
                    if(it.node.right!=null){
                        s.push(new Pair(it.node.right,1));
                    }
                }

                else{
                    pre.add(it.node.val);
                }

            }
          }


    }
}