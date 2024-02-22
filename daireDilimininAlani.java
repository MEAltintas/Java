
import java.util.Scanner;

public class daireDilimininAlani {

    public static void main(String[] args) {
        final double PI = 3.14;
        double r, aci, pi, alan;
        Scanner klavye = new Scanner(System.in);
        System.out.println("Yarıçapı giriniz (r): ");
        r = klavye.nextDouble();
        System.out.println("Açıyı giriniz (derece): ");
        aci = klavye.nextDouble();
        alan = aci * PI * Math.pow(r, 2) / 360;
        System.out.printf("Daire diliminin alanı: ", alan);

    }

}
