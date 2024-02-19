
import java.util.Scanner;

public class karelerininToplamı {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir n değeri giriniz: ");
        int n = input.nextInt();
        double toplam = 0;
        for (int i = 1; i <= n; i++) {
            toplam += Math.pow(i, 2);

        }
        System.out.println("Toplam: " + toplam);

    }

}
