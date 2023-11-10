package Binary;

// level order traversal in the tree
import java.util.Scanner;

public class Binary9 {
   static Scanner sc= null;
    public static void main(String[] args) {
        sc= new Scanner(System.in);
         Node root= createTree();
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
    Node right, left;

    public Node(int data) {
        this.data = data;
    }
}
 

