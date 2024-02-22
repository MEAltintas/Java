
import java.util.Scanner;

public class ohmKanunu {

    public static void main(String[] args) {
        double R, İ, V;
        Scanner klavye = new Scanner(System.in);
        System.out.println("İletkenin direncini giriniz (R): ");
        R = klavye.nextDouble();
        System.out.println("İletkenin içinden geçen akımı giriniz (İ): ");
        İ = klavye.nextDouble();
        V = R * İ;
        System.out.printf("Gerilimi hesaplayınız (volt) : " + V);
    }

}
