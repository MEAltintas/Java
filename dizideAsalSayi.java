
import java.util.Scanner;

public class dizideAsalSayi {

    static boolean asalMi(int sayi) {
        if (sayi <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizi uzunluğunu giriniz: ");
        int uzunluk = scanner.nextInt();

        int[] dizi = new int[uzunluk];
        System.out.println("Dizi elemanlarını giriniz:");
        for (int i = 0; i < uzunluk; i++) {
            System.out.print("Dizinin Elemani " + (i + 1) + ": ");
            dizi[i] = scanner.nextInt();
        }

        int[] asalDizi = new int[uzunluk];
        int sayac = 0;

        for (int i = 0; i < uzunluk; i++) {
            if (asalMi(dizi[i])) {
                asalDizi[sayac] = dizi[i];
                sayac++;
            }
        }

        System.out.print("Dizideki asal Sayılar: ");
        for (int i = 0; i < sayac; i++) {
            System.out.print(asalDizi[i] + " ");
        }
    }

}
