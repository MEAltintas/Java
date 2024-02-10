
import java.util.Scanner;

public class isimSayisi {

    public static void main(String[] args) {
        System.out.println("Bir isim giriniz: ");
        Scanner input = new Scanner(System.in);
        String isim = input.nextLine();
        System.out.println("Bir sayı giriniz: ");
        int sayi = input.nextInt();
        for (int i = 0; i < sayi; i++) {
            System.out.println(isim);

        }
    }

}
