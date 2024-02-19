
import java.util.Scanner;

public class mevsimler {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1-İlkbahar ");
        System.out.println("2-Yaz");
        System.out.println("3-Sonbahar");
        System.out.println("4-Kış ");
        System.out.println("Bir mevsim sayısı giriniz: ");
        int m = input.nextInt();
        if (m == 1) {
            System.out.println("Mart Nisan Mayıs: ");
        } else if (m == 2) {
            System.out.println("Haziran Temmuz Ağustos: ");
        } else if (m == 3) {
            System.out.println("Eylül Ekim Kasım: ");
        } else if (m == 4) {
            System.out.println("Aralık Ocak Şubat: ");
        } else {
            System.out.println("Geçersiz seçim: ");
        }
    }

}
