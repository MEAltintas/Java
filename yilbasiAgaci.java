
import java.util.Scanner;

public class yilbasiAgaci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ağacın yüksekliğini giriniz: ");
        int h = input.nextInt();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h - (i + 1); j++) {
                System.out.print(" ");

            }

            for (int k = 0; k < 2 * i + 1; k++) {
                if (k == i) {
                    System.out.print("a");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();

        }
        for (int m = 0; m < h / 2; m++) {
            for (int j = 0; j < h - 1; j++) {
                System.out.print(" ");
            }
            for (int n = 0; n < 1; n++) {
                System.out.print("|");
            }

            System.out.println();
        }

    }

}
