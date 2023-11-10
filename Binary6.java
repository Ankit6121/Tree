package Binary;

import java.util.*;
// height of binary tree 

public class Binary6 {
    static Scanner sc = null;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createTree();
        System.out.println("height of the binary tree is" + height(root));
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public static Node createTree() {
        Node root = null;
        System.out.println("Enter the data");
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        root = new Node(data);
        System.out.println("Enter the left of" + data);
        root.left = createTree();
        System.out.println("Enter the right of" + data);
        root.right = createTree();
        return root;
    }
}

class Node {
    int data;
    Node right, left;

    public Node(int data) {
        this.data = data;
    }
}
