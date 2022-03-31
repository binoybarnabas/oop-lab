import java.util.Scanner;

public class matadd {
    public static void main(String args[]) {
        int arr1[][] = new int[10][10];
        int arr2[][] = new int[10][10];
        int arr3[][] = new int[10][10];
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the order of 2 matrices as M x N");
        int m = obj.nextInt();
        int n = obj.nextInt();
        System.out.println("enter the elements in the first matrix in row wise form: ");
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                arr1[i][j] = obj.nextInt();
            }
        }
        System.out.println("enter the elements in the second matrix in row wise form: ");
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                arr2[i][j] = obj.nextInt();
            }
        }

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        System.out.println("***** RESULT *****");

        for (int i = 0; i < m; ++i) {
            System.out.println();
            for (int j = 0; j < n; ++j) {
                System.out.print(" " + arr3[i][j]);
            }
        }


        




    }
}
