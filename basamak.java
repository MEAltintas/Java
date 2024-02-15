
import java.util.Scanner;

public class basamak {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 99; i++) {
            int birler = i % 10;
            int onlar = i / 10;
            int toplam = birler + onlar;
            if (toplam % 2 == 1) {
                System.out.println("Sayılar: " + i);
            }

        }
    }

}
