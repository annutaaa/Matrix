import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MatrixHomework {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value fo M: ");
        int m = scanner.nextInt();
        System.out.println("Enter value fo N: ");
        int n = scanner.nextInt();
        int[][] array2D1 = new int[m][n];
        int[][] array2D2 = new int[n][m];

        for (int i = 0; i < array2D1.length; i++) {
            for (int j = 0; j < array2D1[i].length; j++) {
                array2D1[i][j] = random.nextInt(10);
            }
        }

        for (int i = 0; i < array2D2.length; i++) {
            for (int j = 0; j < array2D2[i].length; j++) {
                array2D2[i][j] = array2D1[j][i];
            }
        }

        for (int i = 0; i < array2D1.length; i++) {
            System.out.println(Arrays.toString(array2D1[i]));
        }
        for (int i = 0; i < array2D2.length; i++) {
            System.out.println(Arrays.toString(array2D2[i]));
        }
    }
}
