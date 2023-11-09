import java.util.Random;

public class buildMatrix {
    static int i, j;
    static Random random = new Random();
    public static void build(int[][] matrix){
        for (i=0 ; i < matrix.length; i++) {
            for (j=0; j < matrix[i].length; j++) {
                matrix[i][j]=random.nextInt(10) + 1;
            }
        }
        for (i=0; i < matrix.length; i++, System.out.println()) {
            for (j=0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
        }
    }
}
