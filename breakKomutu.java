
import java.util.Scanner;

public class breakKomutu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
    }

}
