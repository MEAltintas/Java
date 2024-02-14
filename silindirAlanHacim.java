
import java.util.Scanner;

public class silindirAlanHacim {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Yarıçapı giriniz: ");
        int r = input.nextInt();
        System.out.println("Yüksekliği giriniz: ");
        int h = input.nextInt();
        double pi = 3.14;
        double alan = 2 * pi * r * h;
        double hacim = pi * (r * r) * h;
        System.out.println("Silindirin alanı: " + alan);
        System.out.println("Silindirin hacmi: " + hacim);
    }
}


