import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <matrix[i].length ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("Enter the number of degrees of rotation: ");
        int a = scanner.nextInt();
        int b = a/90;
        int k=1;
        while (k<=b) {
            k++;
            for (int i = 0; i < matrix.length; i++) {
                int temp = matrix[i][2];
                matrix[i][2] = matrix[0][i];
                matrix[0][i] = temp;
            }
            for (int i = 1; i < matrix.length; i++) {
                int temp = matrix[i][0];
                matrix[i][0] = matrix[i][2];
                matrix[i][2] = temp;
            }

            for (int i = 1; i < matrix.length; i++) {
                for (int j = matrix[i].length - 1; j > 1; j--) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }

        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}

