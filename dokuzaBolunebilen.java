
import java.util.Scanner;

public class dokuzaBolunebilen {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("9'a kalansız bölünebilen sayılar: ");
        for (int i = 1; i <= 999; i++) {
            if (i % 9 == 0) {
                System.out.println(i + "");
            }
        }
    }

}
