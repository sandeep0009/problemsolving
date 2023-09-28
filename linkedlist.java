import java.util.Scanner;
import java.util.*;

class Node {
    int val;
    Node left;

    Node(int data) {
        val = data;
        left = null;
    }
}

public class linkedlist {
    public static void print(Node head) {
        Node current = head; // Initialize a current node to traverse the list
        while (current != null) {
            System.out.println(current.val);
            current = current.left; // Move to the next node
        }
    }
    public static Node insertathead(Node head,int data){
        Node n=new Node(data);
        if(head==null)n=head;
        n.left=head;
        head=n;
        return head;

    }

    public static Node insertAtend(Node head,int data){
        Node temp=head;
        Node n=new Node(data);
        if(head==null)
        {
            n=head;
            return head;
        }
        while(temp.left!=null){
            temp=temp.left;
        }
        temp.left=n;
      
        return n;
    }


    public static Node insetAtmiddle(Node head,int data,int pos){
        Node temp=head;
        int count=1;
        Node newnode=new Node(data);


        if (pos == 1) {
            newnode.left = head;
            return newnode;
        }
        while(count<pos-1 && temp!=null){
            temp=temp.left;
            count++;
        }

        newnode.left=temp.left;
        temp.left=newnode;
        return head;
    }

    public static Node delte(Node head,int pos){
        Node temp=head;
        int count=0;

        if(pos==0){
            return head.left;
        }
        while(count<pos-1 && temp!=null){
            temp=temp.left;
            count++;
        }
        temp.left=temp.left.left;
        return head;
    }

    public static boolean isplaindrome(Node head){
        Node slow=head;

        boolean isplain=true;

        Stack<Integer>res=new Stack<Integer>();

        while(slow!=null){
            res.push(slow.val);
            slow=slow.left;
        }

        while(head!=null){
            int i=res.pop();
            if(head.val==i){
                isplain=true;
                

            }
            else{
                isplain=false;
            
                break;
            }
            head=head.left;

        }
        return isplain;

    }


    public static boolean iscycle(Node head){
        Node slow=head;
        Node fast=head;
      
        while(fast!=null && fast.left!=null){
          slow=slow.left;
          fast=fast.left.left;
          if(slow==fast){
            return true;
          }

        }
        return false;
    }


    public static Node cyclebreak(Node head){
        if(!iscycle(head))return null;
        Node slow=head;
        Node fast=head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.left;
            fast=fast.left;

        }
        prev.left=null;
        return head;


         
    }

    public static void main(String[] args) {
        Node head = new Node(5);
        insertAtend(head, 03);
        head=insetAtmiddle(head, 1, 3);

        System.out.println(iscycle(head));
        
    }
}
