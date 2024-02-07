
import java.util.Scanner;

public class kdv {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ürün fiyatı giriniz: ");
        double urunfiyat = input.nextDouble();

        System.out.println("KDV değerini giriniz: ");
        double kdv = input.nextDouble();
        kdv = (urunfiyat * kdv) / 100;
        double kdvliFiyat = urunfiyat + kdv;
        double indirimliFiyat;
        if (kdv > 30) {
            indirimliFiyat = kdvliFiyat - ((kdvliFiyat * 2) / 100);
            System.out.println("İndirimli Fiyat: " + indirimliFiyat);
        } else {
            System.out.println("KDV'li Fiyat: " + kdvliFiyat);
        }
    }
}
