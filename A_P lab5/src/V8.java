import java.util.Random;

public class V8 {
    public static void main(String[] args) {
        int i, j;
        Random random = new Random();
        int m = random.nextInt(2, 5);
        int n = random.nextInt(2,5);
        int[][] matrix = new int[m][n];
        buildMatrix.build(matrix);
        int min = matrix[0][0];
        int max = matrix[0][0];
        for (i = 0; i < matrix.length; i++){
            for (j = 0; j < matrix[i].length; j++){
                if (min > matrix[i][j]){
                    min = matrix[i][j];
                } else if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }
        float average = (float) (min+max)/2;
        System.out.println("Среднее арифметическое максимального и минимального элементов = " + average);
    }
}