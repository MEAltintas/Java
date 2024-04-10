
import java.util.Scanner;

public class dizideElemanFrekansi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizi boyutunu giriniz: ");
        int sayi = input.nextInt();
        int dizi[] = new int[sayi];
        int tekrarEden[] = new int[sayi];

        System.out.println("Dizi elemanlarını giriniz");
        for (int i = 0; i < sayi; i++) {
            System.out.print("Dizi [" + i + "]: ");
            dizi[i] = input.nextInt();
        }
        System.out.println("Dizideki eleman frekansı");
        int kontrol = 0;
        for (int i = 0; i < sayi; i++) {
            int sayac = 0;
            for (int j = 0; j < sayi; j++) {
                if (dizi[i] == tekrarEden[j]) {
                    sayac++;
                }
            }
            if (sayac == 0) {
                int frekans = 0;
                for (int k = 0; k < sayi; k++) {
                    if (dizi[i] == dizi[k]) {
                        frekans++;
                    }
                }
                tekrarEden[kontrol] = dizi[i];
                kontrol++;
                System.out.println(dizi[i] + " : " + frekans);

            }
        }
    }

}
