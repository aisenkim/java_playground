package algoexpert.binary_search_tree;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BstTraverseTest {

    static BstTraverse solution;
    Node root;

    @BeforeAll
    static void setup() {
       solution = new BstTraverse();
    }

    @BeforeEach
    void before() {
        root = new Node(10);
        root.left = new Node(5);
        root.left.left = new Node(2);
        root.left.left.left = new Node(1);
        root.left.right = new Node(5);
        root.right = new Node(15);
        root.right.right = new Node(22);
    }

    @DisplayName("Recursive")
    @Test
    void reverseInorderTraversalRecursive() {

        List<Integer> expected = Arrays.asList(22, 15, 10, 5, 5, 2, 1);
        List<Integer> actual = solution.reverseInorderTraversal(root, new ArrayList<Integer>());

        assertEquals(expected, actual);
    }

    @DisplayName("Iterative")
    @Test
    void reverseInorderTraversalIterative() {

        List<Integer> expected = Arrays.asList(22, 15, 10, 5, 5, 2, 1);
        List<Integer> actual = solution.reverseInOrderTraversalIterate(root, new ArrayList<>());
        assertEquals(expected, actual);
    }
}