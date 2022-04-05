package algoexpert.binary_search_tree;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthLargestElementTest {
    static KthLargestElement solution;

    @BeforeAll
    static void setup() {
        solution = new KthLargestElement();
    }

    @Test
    @DisplayName("Kth Largest Element")
    void exampleOne() {
        KthLargestElement.BST root = new KthLargestElement.BST(15);
        root.left = new KthLargestElement.BST(5);
        root.left.left = new KthLargestElement.BST(2);
        root.left.left.left = new KthLargestElement.BST(1);
        root.left.left.right = new KthLargestElement.BST(3);
        root.left.right = new KthLargestElement.BST(5);
        root.right = new KthLargestElement.BST(20);
        root.right.left = new KthLargestElement.BST(17);
        root.right.right = new KthLargestElement.BST(22);
        int k = 3;
        int expected = 17;
        int actual = new KthLargestElement().findKthLargestValueInBst(root, k);
        assertEquals(expected, actual);
    }

}