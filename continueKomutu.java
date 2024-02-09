
import java.util.Scanner;

public class continueKomutu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);

        }
    }

}
