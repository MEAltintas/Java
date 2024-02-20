
import java.util.Scanner;

public class pisagorTeoremi {

    public static void main(String[] args) {
        double a, b, c;
        Scanner klavye = new Scanner(System.in);
        System.out.println("Birinci dik kenarı giriniz (cm) : ");
        a = klavye.nextDouble();
        System.out.println("İkinci dik kenarı giriniz (cm): ");
        b = klavye.nextDouble();
        c = Math.pow(a, 2) + Math.pow(b, 2);
        c = Math.sqrt(c);
        System.out.print("Hipotenüs :" + c);
    }

}
