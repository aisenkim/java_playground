package algoexpert.graph;

import java.util.ArrayList;
import java.util.List;

public class RiverSizes {

    public static List<Integer> riverSizes(int[][] matrix) {
        List<Integer> sizes = new ArrayList<>();
        boolean[][] aux = new boolean[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // only when not seen yet
                if (!aux[i][j]) {
                    int currentCount = checkNeighbors(i, j, matrix, aux);
                    if (currentCount > 0)
                        sizes.add(currentCount);
                }
            }
        }

        return sizes;
    }

    /**
     * check if neighbor is a river(1)
     */
    private static int checkNeighbors(int row, int col, int[][] matrix, boolean[][] aux) {
        if (row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length || matrix[row][col] == 0)
            return 0;
        if (aux[row][col])
            return 0;

        aux[row][col] = true;

        int counter = 1;

        counter += checkNeighbors(row - 1, col, matrix, aux);
        counter += checkNeighbors(row + 1, col, matrix, aux);
        counter += checkNeighbors(row, col - 1, matrix, aux);
        counter += checkNeighbors(row, col + 1, matrix, aux);
        return counter;
    }

}
