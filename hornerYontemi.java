
import java.util.Scanner;

public class hornerYontemi {

    public static void main(String[] args) {
        // horner yöntemi
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin eleman sayısını giriniz: ");
        int N = input.nextInt();
        int A[] = new int[N];
        for (int i = 1; i < N + 1; i++) {
            System.out.print("A[" + (i + 1) + "]=");
            A[i] = input.nextInt();
        }
        int t = A[N + 1];
        int b = 1;
        for (int i = N; i < 1; i--) {
            t = t * b + A[i];

        }
        System.out.println("Sonuç: " + t);
    }

}
