
import java.util.Scanner;

public class matris {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Matrisin satır sayısını giriniz: ");
        int satir = input.nextInt();

        System.out.print("Matrisin sütun sayısını giriniz: ");
        int sutun = input.nextInt();

        int[][] matris = new int[satir][sutun];

        System.out.println("Matris elemanlarını giriniz: ");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print("Matris[" + i + "][" + j + "]: ");
                matris[i][j] = input.nextInt();
            }
        }
        System.out.println("Matris: ");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println();
        }

        int[][] transpoz = new int[sutun][satir];
        for (int i = 0; i < sutun; i++) {
            for (int j = 0; j < satir; j++) {
                transpoz[i][j] = matris[j][i];
            }
        }

        System.out.println("Matrisin Transpozu:");
        for (int i = 0; i < sutun; i++) {
            for (int j = 0; j < satir; j++) {
                System.out.print(transpoz[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
