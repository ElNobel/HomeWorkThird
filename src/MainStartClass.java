
public class MainStartClass {
    public static void main(String[] args) {
        int[][] firstMatrix = new int[5][5];
        int[][] secondMatrix = new int[5][5];
        MultiMatrix.doRandomMatrix(firstMatrix);
        MultiMatrix.doRandomMatrix(secondMatrix);
        int[][] result = MultiMatrix.multiplyMatrix(firstMatrix, secondMatrix);
        MultiMatrix.printResult(result);
        System.out.println();

        int[][] firstTestMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] secondTestMatrix = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        System.out.println(MultiMatrix.testMultyMatrix(firstTestMatrix, secondTestMatrix));
    }
}

