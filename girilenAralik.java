
import java.util.Scanner;

public class girilenAralik {

    public static void main(String[] args) {
        // Kullanıcıdan girilen değer aralığını her satıra 10 luk sayılar gelecek şekilde yazma
        Scanner input = new Scanner(System.in);
        System.out.println("Bir değer aralığı giriniz: ");
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();
        for (int i = sayi1; i <= sayi2; i++) {
            if (i % 10 != 0) {
                System.out.print(i + " ");
            } else {
                System.out.println(i + " ");
            }
        }

    }
}
