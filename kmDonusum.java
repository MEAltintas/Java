
import java.util.Scanner;

public class kmDonusum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dönüştürmek istediğiniz metre cinsinden bir değer giriniz: ");
        double metre = input.nextDouble();
        double km = metre * 0.001;
        double cm = metre * 100;
        System.out.println("KM: " + km + " CM: " + cm);
    }
}
