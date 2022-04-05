package algoexpert.graph;

import java.util.*;

public class MinimumPassMatrix {

    public int minimumPassesOfMatrix(int[][] matrix) {
        // helper function to convert all negative
        int passes = convertNegative(matrix);
        // check if any negatives still left (the impossible positions)
        boolean hasNegative = checkNegative(matrix);
        return hasNegative ? -1 : passes - 1;
    }

    /**
     * Use two stacks
     *
     * @return number of passes
     */
    private int convertNegative(int[][] matrix) {
        int passes = 0;
        // start with next pass stack
        Stack<int[]> nextStack = getAllPositives(matrix);

        while (!nextStack.isEmpty()) {
            // perform swapping of stacks
            Stack<int[]> currentStack = nextStack;
            nextStack = new Stack<int[]>();

            while (!currentStack.isEmpty()) {
                int[] positivePosition = currentStack.pop();

                // put all neighbors values to nextStack
                ArrayList<int[]> neighbors = getAllNeighbors(positivePosition[0], positivePosition[1], matrix);
                for (int[] position : neighbors) {
                    int row = position[0];
                    int col = position[1];
                    if (matrix[row][col] < 0) {
                        matrix[row][col] *= -1;
                        nextStack.push(new int[]{row, col});
                    }
                }
            }
            passes++;
        }

        return passes;
    }

    private ArrayList<int[]> getAllNeighbors(int row, int col, int[][] matrix) {
        ArrayList<int[]> neighbors = new ArrayList<>();
        if (row > 0)
            neighbors.add(new int[]{row - 1, col});
        if (row < matrix.length - 1)
            neighbors.add(new int[]{row + 1, col});
        if (col > 0)
            neighbors.add(new int[]{row, col - 1});
        if (col < matrix[row].length - 1)
            neighbors.add(new int[]{row, col + 1});

        return neighbors;
    }

    private Stack<int[]> getAllPositives(int[][] matrix) {
        Stack<int[]> positiveValueStack = new Stack<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > 0)
                    positiveValueStack.push(new int[]{i, j});
            }
        }
        return positiveValueStack;
    }


    /**
     * Checks if negative exists in the matrix
     * If it does, it's impossible to convert that to positive at this point
     *
     * @return true if has negative. Otherwise false
     */
    private boolean checkNegative(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0)
                    return true;
            }
        }
        return false;
    }
}


