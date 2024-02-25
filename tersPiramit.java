
import java.util.Scanner;

public class tersPiramit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("N değerini giriniz: ");
        int k, j, i, N = input.nextInt();
        for (i = 10; 0 < i; i--) {
            for (j = i; j < 10; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

}
