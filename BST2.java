package BST;

import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class BST2 {
    Node root = null;

    public static void main(String[] args) {
        BST2 tree = new BST2();
        tree.root = tree.insert(tree.root, 10);
        tree.insert(tree.root, 2);
        tree.insert(tree.root, 100);
        tree.insert(tree.root, 50);

        tree.insert(tree.root, 19);
        tree.insert(tree.root, 3);
        tree.insert(tree.root, 5);
        tree.inorder(tree.root);
    }

    static Node insert(Node node, int key) {
        if (node == null) {
            node = new Node(key);
            return node;
        }
        if (node.data < key) {
            node.right = insert(node.right, key);
        } else if (node.data > key) {
            node.left = insert(node.left, key);
        }
        return node;
    }

    static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }
    public static search(Node root,int key){
        
    }
}
