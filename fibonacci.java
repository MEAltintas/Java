
import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = input.nextInt();
        int sayi1 = 1;
        int sayi2 = 1;
        System.out.println(sayi1);
        System.out.println(sayi2);
        for (int i = 2; i < sayi; i++) {
            int sayi3 = sayi1 + sayi2;
            sayi1 = sayi2;
            sayi2 = sayi3;
            System.out.println(sayi3);
        }
    }

}
