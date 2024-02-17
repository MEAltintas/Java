
import java.util.Scanner;

public class palindromSayi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int palindrom = input.nextInt();
        int ilkdeger = palindrom;
        int length = String.valueOf(palindrom).length();
        int kalan, deger = 0;
        for (int i = 0; i < length; i++) {
            kalan = palindrom % 10;
            deger = deger * 10 + kalan;
            palindrom = palindrom / 10;

        }
        if (deger == ilkdeger) {
            System.out.println(deger + " Palindrom sayıdır. ");
        } else {
            System.out.println(deger + " Palindrom sayı değildir. ");
        }
    }

}
