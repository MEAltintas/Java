
import java.util.Scanner;

public class potansiyelVeKinetikEnerji {

    public static void main(String[] args) {
        double m, v, h, ep, ek;
        Scanner klavye = new Scanner(System.in);
        System.out.println("Maddenin kütlesini giriniz (m): ");
        m = klavye.nextDouble();
        System.out.println("Maddenin hızını giriniz (v): ");
        v = klavye.nextDouble();
        System.out.println("Maddenin yerden yüksekliğini giriniz (h): ");
        h = klavye.nextDouble();
        ep = m * 9.8 * h;
        ek = m * Math.pow(v, 2) / 2;
        System.out.printf("Potansiyel enerjisi ve kinetik enerjisi: ", ep, ek);

    }

}
