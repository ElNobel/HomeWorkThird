import java.util.Random;

public class MultiMatrix {
    private static int[][] resultMatrix;

    public static int[][] multiplyMatrix(int[][] firstMatrix, int[][] secondMatrix) {
        int rowCount = firstMatrix.length;
        int colCount = secondMatrix[0].length;
        int sumLength = secondMatrix.length;
        resultMatrix = new int[rowCount][colCount];

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                int multiply = 0;
                for (int a = 0; a < sumLength; a++) {
                    multiply += firstMatrix[i][a] * secondMatrix[a][j];
                    resultMatrix[i][j] = multiply;
                }
            }
        }
        return resultMatrix;
    }

    public static void printResultMatrix() {
        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[0].length; j++) {
                System.out.format("%6d", resultMatrix[i][j]);
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

}
