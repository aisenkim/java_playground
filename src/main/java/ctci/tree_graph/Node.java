package ctci.tree_graph;

public class Node {

    public int value;
    public Node left;
    public Node right;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public void insert(Node node) {
        if(node == null)
            return;
        if(node.value < this.value){
            if(this.left == null) {
                this.left = new Node(node.value);
            } else {
                this.left.insert(node);
            }
        } else {
            if (this.right == null) {
                this.right = new Node(node.value);
            } else {
                this.right.insert(node);
            }
        }

    }

    // IN ORDER TRAVERSAL
    public void inOrderTraversal(Node node) {
        if(node != null) {
            inOrderTraversal(node.left);
            System.out.println("Value is: " + node.value);
            inOrderTraversal(node.right);
        }
    }
}
