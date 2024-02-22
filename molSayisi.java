
import java.util.Scanner;

public class molSayisi {

    public static void main(String[] args) {
        double m, mA, mol;
        Scanner klavye = new Scanner(System.in);
        System.out.println("Maddenin kütlesini giriniz (m): ");
        m = klavye.nextDouble();
        System.out.println("Maddenin molekül ağırlığını giriniz (mA): ");
        mA = klavye.nextDouble();
        mol = m / mA;
        System.out.printf("Mol sayısı (m/mA): ", mol);
    }

}
