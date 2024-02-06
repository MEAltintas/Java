
import java.util.Scanner;

public class ucgenKenar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Birinci kenarı giriniz: ");
        int a = input.nextInt();

        System.out.println("İkinci kenarı giriniz: ");
        int b = input.nextInt();

        System.out.println("Üçüncü kenarı giriniz: ");
        int c = input.nextInt();

        if (a == b && a == c) {
            System.out.println("Eşkenar Üçgen");

        } else if (a == b || a == c || b == c) {
            System.out.println("İkizkenar Üçgen");
        } else {
            System.out.println("Çeşitkenar üçgen");
        }
    }

}
