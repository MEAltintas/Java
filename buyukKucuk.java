
import java.util.Scanner;

public class buyukKucuk {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz: ");
        int n = input.nextInt();
        int min = 0;
        int max = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            int sayi1 = input.nextInt();

            if (sayi1 < min || min == 0) {
                min = sayi1;

            } else if (sayi1 > max) {
                max = sayi1;

            }
        }
        System.out.println("Girilen sayılar arasında en büyük sayı: " + max);
        System.out.println("Girilen sayılar arasında en küçük sayı: " + min);
    }
}
