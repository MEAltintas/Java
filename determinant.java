
import java.util.Scanner;

public class determinant {

    public static void main(String[] args) {
        // 
        Scanner input = new Scanner(System.in);
        System.out.println("N değerini giriniz: ");
        int n = input.nextInt();
        int A[][] = new int[3][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("A[" + i + "," + j + "]=?");
                A[i][j] = input.nextInt();

            }
        }
        int d = A[0][0] * A[1][1] - A[0][1] * A[1][0];
        System.out.println("Determinant= " + d);
    }

}
