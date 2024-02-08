
import java.util.Scanner;

public class forİleToplama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir değer giriniz: ");
        int sayi = input.nextInt();
        int toplam = 0;
        for (int i = 0; i <= sayi; i++) {
            toplam += i;

            System.out.println("Toplam: " + toplam);
        }
    }

}
