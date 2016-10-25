
public class MainStartClass {
    public static void main(String[] args) {
        int[][] firstMatrix = new int[5][5];
        int[][] secondMatrix = new int[5][5];
        MultiMatrix.doRandomMatrix(firstMatrix);
        MultiMatrix.doRandomMatrix(secondMatrix);
        MultiMatrix.multiplyMatrix(firstMatrix,secondMatrix);
        MultiMatrix.printResultMatrix();
    }
}
