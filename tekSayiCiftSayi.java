
import java.util.Scanner;

public class tekSayiCiftSayi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir N değeri giriniz: ");
        int n = input.nextInt();
        int tektoplam = 0;
        int tekcarp = 1;
        int ciftsayi = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                tektoplam += i;
                tekcarp = tekcarp * i;
            } else {
                ciftsayi = (i * i) + ciftsayi;

            }
        }
        System.out.println("Tek sayı toplamı: " + tektoplam);
        System.out.println("Tek sayı çarpımı: " + tekcarp);
        System.out.println("Çift sayı toplamı: " + ciftsayi);
    }

}


