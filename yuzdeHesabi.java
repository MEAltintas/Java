
import java.util.Scanner;

public class yuzdeHesabi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = input.nextInt();
        System.out.println("Yüzde değeri giriniz: ");
        int yuzde = input.nextInt();
        double sonuc = (yuzde * sayi) / 100;
        System.out.println("Yüzde sonucu: " + sonuc);
    }
}
