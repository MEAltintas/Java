
import java.util.Scanner;

public class herSatiraOnSayi {

    public static void main(String[] args) {
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
