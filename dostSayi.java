
import java.util.Scanner;

public class dostSayi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir n değeri giriniz: ");
        int n = input.nextInt();
        System.out.println("Bir m değeri giriniz: ");
        int m = input.nextInt();
        int tn = 0;
        int tm = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                tn += i;
            }
        }
        for (int i = 1; i < m; i++) {
            if (m % i == 0) {
                tm += i;
            }
        }
        if (tn == m && tm == n) {
            System.out.println("Dost sayı");
        } else {
            System.out.println("Dost sayı değil");
        }
    }

}
