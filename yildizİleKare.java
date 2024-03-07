
import java.util.Scanner;

public class yildizİleKare {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = input.nextInt();
        for (int i = 0; i < sayi; i++) {

            if (i == 0 || i == sayi - 1) {
                for (int j = 0; j < sayi; j++) {
                    System.out.print("*");
                }

            } else {
                for (int j = 0; j < sayi; j++) {
                    if (j == 0 || j == sayi - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }

            }

            System.out.println();
        }
    }
}
