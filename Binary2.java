package Binary;

import java.util.*;

public class Binary2 {
    static Scanner sc = null;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createTree();
        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
    }

    static void postorder(Node root) {
        if (root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    static Node createTree() {
        Node root = null;
        System.out.println("enter data: ");
        int data = sc.nextInt();
        if (data == -1)
            return null;

        root = new Node(data);

        System.out.println("Enter left for" + data);
        root.left = createTree();
        System.out.println("Enter right for" + data);
        root.right = createTree();

        return root;
    }

    static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + "->");
        inorder(root.right);

    }

    static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

}

class Node {
    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
    }
}