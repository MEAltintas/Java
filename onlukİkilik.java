
import java.util.Scanner;

public class onlukİkilik {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int sayi, s = 0, i = 0, basamak;
        sayi = input.nextInt();
        while (sayi > 0) {

            basamak = (int) ((sayi % 2) * Math.pow(10, i));
            i++;
            sayi = sayi / 2;
            s = s + basamak;
        }
        System.out.println(s);
    }

}
