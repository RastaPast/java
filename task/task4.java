package task;

import java.util.Arrays;
import java.util.Random;

public class task4 {
    public static void twoDimensionalArray() {
        Random random = new Random();
        int[][] matrix = new int[20][20];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(25);
            }
        }

        System.out.println("Исходная матрица:");
        printMatrix(matrix);

        for (int i = 0; i < matrix.length; i++) {
            int matrixInRow = matrix[i][0];
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] > matrixInRow) {
                    matrixInRow = matrix[i][j];
                }
            }

            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] += matrixInRow;
            }
        }

        System.out.println("\nМатрица после прибавления максимального элемента строки:");
        printMatrix(matrix);

    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
