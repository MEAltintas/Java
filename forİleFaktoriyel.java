
import java.util.Scanner;

public class forİleFaktoriyel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = input.nextInt();
        int fackt = 1;
        for (int i = 1; i <= sayi; i++) {
            fackt = fackt * i;
        }
        System.out.println("Faktöriyel: " + fackt);
    }

}
