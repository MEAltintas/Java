import java.util.Arrays;
import java.util.Scanner;

public class DiziIslemleri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Dizinin boyutunu kullanıcıdan al
        System.out.print("Dizi kaç elemanlı olacak?: ");
        int boyut = scanner.nextInt();
        
        int[] dizi = new int[boyut];
        
        // Dizinin elemanlarını kullanıcıdan al
        System.out.println(boyut + " elemanı girin:");
        for (int i = 0; i < boyut; i++) {
            System.out.print((i + 1) + ". eleman: ");
            dizi[i] = scanner.nextInt();
        }

        // Diziyi sıralama
        Arrays.sort(dizi);

        // Dizinin toplamını hesaplama
        int toplam = 0;
        for (int i = 0; i < dizi.length; i++) {
            toplam += dizi[i];
        }

        // Dizinin ortalamasını hesaplama
        double ortalama = (double) toplam / boyut;

        // Maksimum ve minimum değerleri bulma
        int maksimum = dizi[dizi.length - 1];
        int minimum = dizi[0];

        // Sonuçları yazdır
        System.out.println("Dizi (küçükten büyüğe sıralı): " + Arrays.toString(dizi));
        System.out.println("Toplam: " + toplam);
        System.out.println("Ortalama: " + ortalama);
        System.out.println("Maksimum: " + maksimum);
        System.out.println("Minimum: " + minimum);
        
        scanner.close();
    }
}
