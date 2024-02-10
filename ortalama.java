
import java.util.Scanner;

public class ortalama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int toplam = 0;
        double ort = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Bir sayı giriniz: ");
            int sayi = input.nextInt();
            toplam += sayi;

        }
        ort = toplam / 10;
        System.out.println("Ortalama: " + ort);

    }
}


