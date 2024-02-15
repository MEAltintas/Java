
import java.util.Scanner;

public class pozitifNegatif {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = input.nextInt();
        if (sayi < 0) {
            System.out.println("Sayı negatiftir.");
            sayi = sayi * (-1);
            System.out.println("Pozitif hali: " + sayi); //+Math.abs(sayi) +sayi yerine yazılır.
        } else if (sayi > 0) {
            System.out.println("Sayı pozitiftir.");
            sayi = sayi * (-1);
            System.out.println("Negatif hali: " + sayi);
        }
    }

}
