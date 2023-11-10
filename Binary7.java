package Binary;

import java.util.*;

public class Binary7 {
    static Scanner sc = null;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createTree();
        System.out.println("Total number of nodes in the given tree is" + CountNode(root));
    }

    static int CountNode(Node root) {
        if (root == null)
            return 0;
        return CountNode(root.left) + CountNode(root.right) + 1;

    }

    static Node createTree() {
        Node root = null;
        System.out.println("Enter the data");
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        root = new Node(data);
        System.out.println("Enter the left" + data);
        root.left = createTree();
        System.out.println("Enter the right" + data);
        root.right = createTree();

        return root;
    }
}

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
    }
}
