import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        int temp = matrix.length / 2;
        int start = 0;
        int end = matrix.length - 1;

        while(start <= temp) {
            if(start % 2 == 0) {
                for(int i = start; i <= end; i++) {
                    matrix[start][i] = 1;
                }

                for(int i = start; i <= end; i++) {
                    matrix[i][end] = 1;
                }

                for(int i = end; i >= start; i--) {
                    matrix[end][i] = 1;
                }

                for(int i = end; i >= start; i--) {
                    matrix[i][start] = 1;
                }
            }

            start++;
            end--;
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
