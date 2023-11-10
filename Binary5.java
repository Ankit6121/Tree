package Binary;

import java.util.*;

public class Binary5 {
    static Scanner sc = null;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createTree();
        postorder(root);
    }

    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static Node createTree() {
        Node root = null;
        System.out.println("Enter the data");
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        root = new Node(data);
        System.out.println("Enter the left of " + data);
        root.left = createTree();
        System.out.println("Enter the right of" + data);
        root.right = createTree();

        return root;

    }
}

class Node {
    Node left, right;
    int data;

    public Node(int data) {
        this.data = data;
    }
}
