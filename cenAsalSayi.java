
import java.util.Scanner;

public class cenAsalSayi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir n değeri giriniz: ");
        int n = input.nextInt();
        int sayac = 0;
        int m = n + 2;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                sayac++;

            }
            for (int j = 2; j < m; j++) {
                if (m % i == 0) {
                    sayac++;
                }

            }

        }
        if (sayac == 0) {
            System.out.println(" Çen Asal sayıdır");

        } else {
            System.out.println("Çen Asal sayı değil");
        }
    }

}
