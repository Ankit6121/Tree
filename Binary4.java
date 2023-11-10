// package Binary;

// import java.util.*;

// public class Binary4 {
// static Scanner sc = null;

// public static void main(String[] args) {
// sc = new Scanner(System.in);
// Node root = createTree();
// preorder(root);
// }

// public static Node createTree() {
// Node root = null;
// System.out.println("Enter data");
// int data = sc.nextInt();
// if (data == -1) {
// return null;
// }
// root = new Node(data);
// System.out.println("Enter the left of" + data);
// root.left = createTree();
// System.out.println("Enter the right of" + data);
// root.right = createTree();

// return root;
// }

// public static void preorder(Node root)
// {
// if(root==null)
// {
// return;
// }
// System.out.println(root.data);
// preorder(root.left);
// preorder(root.right);

// }
// }

// class Node {
// Node left, right;
// int data;

// public Node(int data) {
// this.data = data;
// }
// }
