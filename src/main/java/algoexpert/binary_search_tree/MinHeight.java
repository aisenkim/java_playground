package algoexpert.binary_search_tree;

import java.util.ArrayList;
import java.util.List;

public class MinHeight {

    static class BST {
        int value;
        BST left;
        BST right;

        public BST(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    public static BST minHeightBst(List<Integer> array) {
        return constructMinBst(array, 0, array.size() - 1);
    }

    public static BST constructMinBst(List<Integer> array, int startIdx, int endIdx) {
        if (endIdx < startIdx)
            return null;
        int midIdx = (startIdx + endIdx) / 2;
        BST bst = new BST(array.get(midIdx));
        bst.left = constructMinBst(array, startIdx, midIdx - 1);
        bst.right = constructMinBst(array, midIdx + 1, startIdx);
        return bst;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        BST bst = minHeightBst(list);

    }

}

