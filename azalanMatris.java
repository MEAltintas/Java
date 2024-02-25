
import java.util.Scanner;

public class azalanMatris {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("N değeri giriniz: ");
        int N = input.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N + 1 - i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
