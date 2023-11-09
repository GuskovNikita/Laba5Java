import java.util.Arrays;
import java.util.Random;

public class V10 {
    public static void main(String[] args) {
        int i, j;
        Random random = new Random();
        int m = random.nextInt(2, 5);
        int n = random.nextInt(2, 5);
        int[][] matrix = new int[m][n];
        buildMatrix.build(matrix);
        int[] temp = new int[m];
        for (i = 1; i < m; i += 2) {
                for (j = 0; j < n; j++) {
                    temp[i] = matrix[i][j];
                    matrix[i][j] = matrix[i-1][j];
                    matrix[i-1][j] = temp[i];
                }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
