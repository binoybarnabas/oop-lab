import java.util.Scanner;

public class matsym {
    void matrix() {
        int arr[][] = new int[10][10];
        Scanner obj = new Scanner(System.in);
        boolean flag = false;
        System.out.println("enter the order of 2 matrices as M x N the should be square matix");
        int m = obj.nextInt();
        int n = obj.nextInt();
        if (m == n) {

            System.out.println("enter the elements in matrix in row wise form: ");
            for (int i = 0; i < m; ++i) {
                for (int j = 0; j < n; ++j) {
                    arr[i][j] = obj.nextInt();
                }
            }

            for (int i = 0; i < m; ++i) {
                for (int j = 0; j < n; ++j) {
                    if(arr[i][j] != arr[j][i])
                    {
                        flag = true;
                        break;
                    }
                }

            }

            if(flag)
            {
             System.out.println("not a symmetric matrix");   
            }
            else{
                System.out.println("symmetric matrix");  
            }
        } else {
            System.out.println("not a square matrix");
        }

    }

    public static void main(String args[]) {
        matsym objs = new matsym();
        objs.matrix();
    }
}
