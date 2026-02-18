package array.easy;

import java.util.Arrays;

public class Construct2DArray {
    static void main() {
        Construct2DArray solution = new Construct2DArray();
        System.out.println(Arrays.deepToString(solution.construct2DArray(new int[]{1, 2, 3, 4}, 2, 2)));
        System.out.println(Arrays.deepToString(solution.construct2DArray(new int[]{1, 2, 3}, 1, 3)));
        System.out.println(Arrays.deepToString(solution.construct2DArray(new int[]{1, 2}, 1, 1)));
        System.out.println(Arrays.deepToString(solution.construct2DArray(new int[]{1, 1, 1, 1}, 4, 1)));
    }

    public int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length) {
            return new int[][]{};
        }

        int[][] matrix = new int[m][n];

        int globeIndex = 0;

        for (int i = 1; i <= m; i++) {
            int[] row = new int[n];

            for (int j = 0; globeIndex < n * i; j++) {
                row[j] = original[globeIndex];
                globeIndex++;
            }

            matrix[i - 1] = row;
        }
        return matrix;
    }

}
