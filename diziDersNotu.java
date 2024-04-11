
import java.util.Scanner;

public class diziDersNotu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ders Adı giriniz:");
        String dersAdi = input.nextLine();
        System.out.println("Derse ait kaç adet değerlendirme kriteri var ? ");
        int degerlendirmeKriteri = input.nextInt();

        String[] degerAdi = new String[degerlendirmeKriteri];
        int[] degerEtkisi = new int[degerlendirmeKriteri];
        for (int i = 0; i < degerlendirmeKriteri; i++) {
            System.out.println((i + 1) + ". Kriterin adı nedir? :");
            degerAdi[i] = input.next();
            input.nextLine();
            System.out.println((i + 1) + ". Kriterin etkisi : ");
            degerEtkisi[i] = input.nextInt();
        }

        System.out.println("Kaç öğrenci notu gireceksiniz?:");
        int ogrenciSayisi = input.nextInt();
        input.nextLine();

        String[] adSoyad = new String[ogrenciSayisi];
        int[][] notlar = new int[ogrenciSayisi][degerlendirmeKriteri];

        for (int i = 0; i < ogrenciSayisi; i++) {
            System.out.println((i + 1) + ". Öğrencinin adı soyadı:");
            adSoyad[i] = input.nextLine();
            for (int j = 0; j < degerlendirmeKriteri; j++) {
                System.out.println("Öğrencinin " + degerAdi[j] + " notu : ");
                notlar[i][j] = input.nextInt();
                input.nextLine();
            }
        }
        // Öğrenci bilgilerini ve notları ekrana yazdır
        System.out.printf("%-10s ", "Adı");
        for (String kriterAdi : degerAdi) {
            System.out.printf(" %-10s", kriterAdi);
        }
        System.out.println(" Ortalama");

        for (int i = 0; i < ogrenciSayisi; i++) {
            System.out.printf("%-10s", adSoyad[i]);
            for (int j = 0; j < degerlendirmeKriteri; j++) {
                System.out.printf(" %-10d", notlar[i][j]);
            }

            // Ortalamayı hesapla ve yazdır
            double ortalama = hesaplaOrtalama(notlar[i]);
            System.out.printf(" %-10.2f%n", ortalama);
        }
    }

    // Ortalama hesaplama fonksiyonu oluşturdum
    public static double hesaplaOrtalama(int[] notlar) {
        int toplamNot = 0;
        for (int not : notlar) {
            toplamNot += not;
        }
        return (double) toplamNot / notlar.length;
    }
}
