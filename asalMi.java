
import java.util.Scanner;

public class asalMi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = input.nextInt();
        int sayac = 0;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                sayac++;
            }
        }
        if (sayac == 0) {
            System.out.println("Asal sayıdır.");
        } else {
            System.out.println("Asal sayı değildir.");
        }
    }

}
