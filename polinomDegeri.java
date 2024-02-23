
import java.util.Scanner;

public class polinomDegeri {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("y(x) polinomunun derecesi: ");
        int n = input.nextInt();
        int A[] = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            System.out.print("x^" + i + "nin katsayısı: ");
            A[i] = input.nextInt();
        }
        System.out.print("\nHesaplanacak x değeri: ");
        int b = input.nextInt();
        int t = A[0];
        for (int i = 1; i <= n; i++) {
            t += A[i] * Math.pow(b, i);
            System.out.println("\ny(" + b + ")=" + t);

        }
    }

}
