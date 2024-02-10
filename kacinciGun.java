
import java.util.Scanner;

public class kacinciGun {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Haftanın bir gününü giriniz: ");
        String gun = input.nextLine();
        if (gun == "Pazartesi") {
            System.out.println("Haftanın 1.günü");
        } else if (gun == "Salı") {
            System.out.println("Haftanın 2.günü");
        } else if (gun == "Çarşamba") {
            System.out.println("Haftanın 3.günü");
        } else if (gun == "Perşembe") {
            System.out.println("Haftanın 4.günü");
        } else if (gun == "Cuma") {
            System.out.println("Haftanın 5.günü");
        } else if (gun == "Cumartesi") {
            System.out.println("Haftanın 6.günü");
        } else {
            System.out.println("Haftanın 7.günü");
        }
    }

}
