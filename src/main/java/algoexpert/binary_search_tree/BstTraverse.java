package algoexpert.binary_search_tree;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BstTraverse {

    public List<Integer> reverseInorderTraversal(Node node, List<Integer> list) {
        if(node != null) {
            reverseInorderTraversal(node.right, list);
            list.add(node.value);
            reverseInorderTraversal(node.left, list);
        }

        return list;
    }

    public List<Integer> reverseInOrderTraversalIterate(Node root, List<Integer> list) {
        Stack<Node> stack = new Stack<>();
        Node current = root;
        while (!stack.empty() || current != null) {

            if(current != null) {
                stack.push(current);
                current = current.right;
            } else {
                current = stack.pop();
                list.add(current.value);
                current = current.left;
            }
        }
        return list;
    }


}

class Node {
    public int value;
    public Node left;
    public Node right;

    public Node(int value) {
        this.value = value;
    }
}
