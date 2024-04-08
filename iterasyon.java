
import java.util.Scanner;

public class iterasyon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Eleman sayısı giriniz: ");
        int N = input.nextInt();
        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("A[" + (i + 1) + "]=");
            A[i] = input.nextInt();
        }
    }
}
