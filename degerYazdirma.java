
import java.util.Scanner;

public class degerYazdirma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("i'nin değerleri: " + i);
        }
        System.out.println("--------------------------------------");
        for (int j = 10; j < 100; j += 6) {
            System.out.println("j'nin değerleri: " + j);
        }
    }

}
