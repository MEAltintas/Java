
import java.util.Scanner;

public class matrisKosegenToplamı {

    public static void main(String[] args) {
        System.out.print("Kare matrisin tipini giriniz: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int A[][] = new int[n][n];
        int T = 0;
        System.out.println("A matrisi: ");
        System.out.println("------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("A[" + i + "," + j + "]=?");
                A[i][j] = input.nextInt();
            }
        }
        System.out.println("girilen matris: ");
        System.out.println("-------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println(" ");
        }
        for (int i = 0; i < n; i++) {
            T += A[i][n - 1 - i];
        }
        System.out.println("Matrisin yedek köşegeni eleman toplamı: " + T);
    }
}
