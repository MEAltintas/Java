
import java.util.Scanner;

public class standartSapmaVaryans {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Eleman sayısı giriniz: ");
        int N = input.nextInt();
        int A[] = new int[N];
        int ao = 0, t = 0;
        for (int i = 0; i < N; i++) {
            System.out.print("A[" + (i + 1) + "]=");
            A[i] = input.nextInt();
            ao += A[i];
        }
        ao /= N;
        for (int i = 0; i < N; i++) {
            t += (int) Math.pow(A[i] - ao, 2);

        }
        int v = t / N, s = (int) Math.pow(v, 5);
        System.out.println("Standart sapma: " + s);
        System.out.println("Varyans: " + v);
    }

}
