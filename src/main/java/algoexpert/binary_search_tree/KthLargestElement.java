package algoexpert.binary_search_tree;

import java.util.ArrayList;
import java.util.List;

public class KthLargestElement {
    public int findKthLargestValueInBst(BST tree, int k) {
        NodeInfo nodeInfo = new NodeInfo();
        reverseInOrder(tree, nodeInfo, k);
        return nodeInfo.nodeValue;
    }

    public void reverseInOrder(BST node, NodeInfo nodeInfo, int k) {
        if (node == null || nodeInfo.visited == k)
            return;
        reverseInOrder(node.right, nodeInfo, k);
        if (nodeInfo.visited < k) {
            nodeInfo.nodeValue = node.value;
            nodeInfo.visited += 1;
        }
        reverseInOrder(node.left, nodeInfo, k);
    }

    static class BST {
        public int value;
        public BST left = null;
        public BST right = null;

        public BST(int value) {
            this.value = value;
        }
    }

    static class NodeInfo {
        public int nodeValue;
        public int visited;

        public NodeInfo() {
            nodeValue = 0;
            visited = 0;
        }
    }
}
