
import java.util.Scanner;

public class kareKupKarekok {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <= 10; i++) {
            int karesayi = i * i;
            int kupsayi = i * i * i;
            double karekok = Math.sqrt(i);

            System.out.println("Sayı: " + i);

            System.out.println("Karesi: " + karesayi);

            System.out.println("Küpü: " + kupsayi);

            System.out.println("Karekökü: " + karekok);
        }
    }

}
