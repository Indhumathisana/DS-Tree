import java.util.*;
class node
{
  int data;
  node left;
  node right;
  public node (int a)
  {
    data = a;
    left = right = null;
  }
}
public class Main
{
  public static void main (String[]aa)
  {
    node root = new node (5);
      root.left = new node (6);
      root.right = new node (7);
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      System.out.println ("inorder ");
      inorder (root);
      System.out.println ("preorder ");
      preorder (root);
      System.out.println ("postorder ");
      postorder (root);
      search(n,root);
  }
  public static void inorder (node temp)
  {
    if (temp != null)
      {
	inorder (temp.left);
	System.out.println (temp.data);
	inorder (temp.right);
      }
  }
  public static void preorder (node temp)
  {
    if (temp != null)
      {
	System.out.println (temp.data);
	preorder (temp.left);
	preorder (temp.right);
      }
  }
  public static void postorder (node temp)
  {
    if (temp != null)
      {
	postorder (temp.left);
	postorder (temp.right);
	System.out.println (temp.data);
      }
  }
  public static void search(int n,node root)
  {
      if(n==root.data||n==root.left.data||n==root.right.data)
      System.out.println("Found");
      
    
  }
}
