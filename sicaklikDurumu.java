
import java.util.Scanner;

public class sicaklikDurumu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklık değeri giriniz: ");
        double sicaklik = input.nextDouble();
        if (sicaklik <= 0) {
            System.out.println("Katı haldedir.");

        } else if (100 > sicaklik) {
            System.out.println("Sıvı haldedir");
        } else {
            System.out.println("Gaz haldedir");
        }
    }

}
