
import java.util.Scanner;

public class whileİleToplama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = 0;
        sayi = input.nextInt();
        int toplam = 0;
        int i = 0;
        while (i <= sayi) {
            toplam += i;
            System.out.println("Toplam: " + toplam);
            i++;

        }

    }
}
