import java.util.Arrays;
import java.util.Random;

public class V11 {
    public static void main(String[] args) {
        int i, j, sum, min, row = 0, col = 0;
        Random random = new Random();
        int N = random.nextInt(1, 4);
        int[][] matrix = new int[2*N][2*N];
        buildMatrix.build(matrix);
        int[][] square = new int[2][2];
        min = matrix[0][0] + matrix[0][1] + matrix[1][0] + matrix[1][1];
        for (i = 1; i < 2*N; i ++) {
            for (j = 1; j < 2*N; j++) {
                sum = matrix[i][j] + matrix[i][j-1] + matrix[i-1][j] + matrix[i-1][j-1];
                if (sum <= min){
                    min = sum;
                    row = i;
                    col = j;
                }
            }
        }
        square[1][1] = matrix[row][col];
        square[0][1] = matrix[row-1][col];
        square[1][0] = matrix[row][col-1];
        square[0][0] = matrix[row-1][col-1];
        System.out.println(Arrays.deepToString(square));
    }
}
