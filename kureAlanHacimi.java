
import java.util.Scanner;

public class kureAlanHacimi {

    public static void main(String[] args) {
        final double PI = 3.14;
        double r, alan, hacim, pi;
        Scanner klavye = new Scanner(System.in);
        System.out.println("Yarıçapı giriniz (r): ");
        r = klavye.nextDouble();
        alan = 4 * PI * Math.pow(r, 2);//
        hacim = (4 / 3) * PI * Math.pow(r, 3);
        System.out.printf("kürenin alanı:", alan);
        System.out.printf("kürenin hacmi:", hacim);

    }

}
