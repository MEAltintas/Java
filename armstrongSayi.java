
import java.util.Scanner;

public class armstrongSayi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = input.nextInt();
        int basamak = 0;
        int toplam = 0;
        int basamakSayi1 = sayi;
        int basamakSayi2 = sayi;
        while (basamakSayi1 > 0) {
            basamakSayi1 /= 10;
            basamak++;
        }
        while (basamakSayi2 > 0) {
            int basamakDegeri = basamakSayi2 % 10;
            basamakSayi2 /= 10;
            toplam += Math.pow(basamakDegeri, basamak);
        }
        if (sayi == toplam) {
            System.out.println("Armstrong sayıdır.");
        } else {
            System.out.println("Armstrong sayı değildir.");
        }
    }

}
