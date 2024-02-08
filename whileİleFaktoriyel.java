
import java.util.Scanner;

public class whileİleFaktoriyel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = input.nextInt();
        int fackt = 1;
        int i = 1;
        while (i <= sayi) {
            fackt = fackt * i;
            i++;
            System.out.println("Faktöriyel: " + fackt);
        }

    }
}