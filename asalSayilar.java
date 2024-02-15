
import java.util.Scanner;

public class asalSayilar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayac = 0;
        int sayi = input.nextInt();
        for (int i = 2; i < sayi; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    sayac++;
                }
            }
            if (sayac == 0) {
                System.out.println(i);
            } else {
                sayac = 0;
            }
        }
    }

}
