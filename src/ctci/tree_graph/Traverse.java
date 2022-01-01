package ctci.tree_graph;

public class Traverse {

    public static void main(String[] args) {
        Node root = new Node(10);
        root.insert(new Node(8));
        root.insert(new Node(12));
        root.insert(new Node(19));
        root.insert(new Node(3));

        root.inOrderTraversal(root);

    }

}
