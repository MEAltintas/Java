
import java.util.Scanner;

public class matrisMaxMinEleman {

    public static void main(String[] args) {
        System.out.println("Kare matrisin tipini giriniz: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int A[][] = new int[n][n];
        int enb, enk, enbsatir = 0, enbsutun = 0, enksatir = 0, enksutun = 0;
        System.out.println("A matrisi: ");
        System.out.println("-------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("A[" + i + "," + j + "]=?");
                A[i][j] = input.nextInt();
            }
        }
        System.out.println("girilen matris: ");
        System.out.println("--------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(A[i][j] + "\t");

            }
            System.out.println(" ");

        }
        enk = A[0][0];
        enb = A[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] < enk) {
                    enk = A[i][j];
                    enksatir = i;
                    enksutun = j;
                }
                if (A[i][j] > enb) {
                    enb = A[i][j];
                    enbsatir = i;
                    enbsutun = j;
                }

            }

        }
        System.out.println("Sonuçlar");
        System.out.println("---------");
        System.out.println(" ");

        System.out.println("En büyük eleman: " + enb);
        System.out.println("Konum: " + (enbsatir + 1) + ". satır ve " + (enbsutun + 1) + ". sütunda");
        System.out.println("En küçük eleman: " + enk);
        System.out.println("Konum: " + (enksatir + 1) + ". satır ve " + (enksutun + 1) + ". sütunda");
    }

}
