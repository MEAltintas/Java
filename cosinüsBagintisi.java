
import java.util.Scanner;

public class cosinüsBagintisi {

    public static void main(String[] args) {
        double a, b, c, aci;
        Scanner klavye = new Scanner(System.in);
        System.out.println("Birinci kenarı giriniz (cm): ");
        a = klavye.nextDouble();
        System.out.println("İkinci kenarı giriniz (cm): ");
        b = klavye.nextDouble();
        System.out.println("Aradaki açıyı giriniz (derece):");
        aci = klavye.nextDouble();
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(aci * Math.PI / 180));
        System.out.printf("\nÜçüncükenar: %.2f", c);

    }

}
