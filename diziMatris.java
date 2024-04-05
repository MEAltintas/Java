
import java.util.Scanner;

public class diziMatris {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A[][] = new int[4][4];
        System.out.println("A= ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                A[i][j] = i + j;
                if (A[i][j] > 3) {
                    A[i][j] = Math.abs(i + j - 6);
                }
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("B= ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    System.out.print("0\t");
                } else {
                    System.out.print("1\t");
                }
            }
            System.out.println("");

        }
        System.out.println("C=");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j >= i) {
                    System.out.print("0\t");
                } else {
                    System.out.print("1\t");
                }
            }
            System.out.println(" ");
        }
        System.out.println("D=");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                A[i][4 - 1 - i] = 1;
                System.out.print(A[i][j] + "\t");
            }
            System.out.println(" ");
        }
        System.out.println("E=");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                A[i][j] = i;
                System.out.print(A[i][j] + "\t");
            }
            System.out.println(" ");
        }
        System.out.println("F=");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i - j == 0 || Math.abs(i - j) == 2) {
                    A[i][j] = 0;
                } else {
                    A[i][j] = 1;
                }
                System.out.print(A[i][j] + "\t");
            }
            System.out.println(" ");
        }
    }
}
