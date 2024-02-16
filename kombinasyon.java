
import java.util.Scanner;

public class kombinasyon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir n değeri giriniz: ");
        int n = input.nextInt();
        System.out.println("Bir r değeri giriniz: ");
        int r = input.nextInt();
        int x = n - r;
        int nfact = 1;
        int rfact = 1;
        int xfact = 1;
        for (int i = 1; i <= n; i++) {
            nfact *= i;
        }
        for (int i = 1; i <= r; i++) {
            rfact *= i;
        }
        for (int i = 1; i <= x; i++) {
            xfact *= i;
        }

        int kombinasyon = nfact / (rfact * xfact);
        System.out.println("Cevap: " + kombinasyon);

    }

}
