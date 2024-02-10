
import java.util.Scanner;

public class haftaninGunleri {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        if (sayi == 1) {
            System.out.println("Pazartesi");
        } else if (sayi == 2) {
            System.out.println("Salı");
        } else if (sayi == 3) {
            System.out.println("Çarşamba");
        } else if (sayi == 4) {
            System.out.println("Perşembe");
        } else if (sayi == 5) {
            System.out.println("Cuma");
        } else if (sayi == 6) {
            System.out.println("Cumartesi");
        } else {
            System.out.println("Pazar");
        }
    }

}
