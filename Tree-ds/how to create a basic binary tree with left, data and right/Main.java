import java.util.*;
class node{
    int data;
    node left;
    node right;
    public node(int a){
        data=a;
        left=right=null;
    }
}
public class Main{
public static void main(String args[]){
    
        node root=new node(5);          //method call
        root.left=new node(6);
        root.right=new node(7);
     System.out.println(root);        //to print data part address,right and left address
     System.out.println(root.left);   
     System.out.println(root.right); 
     System.out.println(root.data);  // to print value of data (here a=5),left and right
     System.out.println(root.left.data);   
     System.out.println(root.right.data);   
    
}
}