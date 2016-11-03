import java.util.Arrays;
import java.util.Random;

public class MultiMatrix {

    public static int[][] multiplyMatrix(int[][] firstMatrix, int[][] secondMatrix) {
        if (checkMatrix(firstMatrix) || checkMatrix(secondMatrix)) {
            throw new IllegalArgumentException();
        }
        if (getColumnCount(firstMatrix) != getRowCount(firstMatrix)) {
            throw new IllegalArgumentException();
        }
        int[][] result = new int[getRowCount(firstMatrix)][getColumnCount(secondMatrix)];

        for (int rowNumber = 0; rowNumber < getRowCount(firstMatrix); rowNumber++) {
            for (int columnNumber = 0; columnNumber < getColumnCount(secondMatrix); columnNumber++) {
                result[rowNumber][columnNumber] = multiplyVector(getRow(firstMatrix, rowNumber), getColumn(secondMatrix, columnNumber));
            }
        }
        return result;
    }

    private static int multiplyVector(int[] firstMatrix, int[] secondMatrix) {
        int multiply = 0;
        for (int i = 0; i < secondMatrix.length; i++) {
            multiply += firstMatrix[i] * secondMatrix[i];
        }
        return multiply;
    }

    private static int[] getColumn(int[][] matrix, int columnNumber) {
        int[] result = new int[getRowCount(matrix)];
        for (int rowNumber = 0; rowNumber < getRowCount(matrix); rowNumber++) {
            result[rowNumber] = matrix[rowNumber][columnNumber];
        }
        return result;
    }

    private static int[] getRow(int[][] matrix, int rowNumber) {
        return matrix[rowNumber];
    }

    private static int getRowCount(int[][] matrix) {
        return matrix.length;
    }

    private static int getColumnCount(int[][] matrix) {
        return matrix[0].length;
    }

    private static boolean checkMatrix(int[][] matrix) {
        if (matrix == null) return true;
        else return false;
    }

    public static void printResult(int[][] matrix) {
        for (int row = 0; row < getRowCount(matrix); row++) {
            for (int column = 0; column < getColumnCount(matrix); column++) {
                System.out.format("%6d", matrix[row][column]);
            }
            System.out.println();
        }
    }

    public static void doRandomMatrix(int[][] randomMatrix) {
        Random intRandom = new Random();

        for (int i = 0; i < randomMatrix.length; i++) {
            for (int j = 0; j < randomMatrix[i].length; j++) {
                randomMatrix[i][j] = intRandom.nextInt(10);
            }
        }
    }

    public static boolean testMultiMatrix(int[][] firstMatrix, int[][] secondMatrix) {
        int[][] resultTestMatrix = {
                {30, 24, 18},
                {84, 69, 54},
                {138, 114, 90}
        };

        return Arrays.deepEquals(multiplyMatrix(firstMatrix,secondMatrix),resultTestMatrix);
    }

}
