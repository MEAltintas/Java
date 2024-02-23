
import java.util.Scanner;

public class cesitliOrtalamalarHesabi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Eleman sayısı giriniz: ");
        int N = input.nextInt();
        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("A[" + (i + 1) + "]=");
            A[i] = input.nextInt();
        }
        int ao = 0, go = 1, ho = 0, kho = 0;
        for (int i = 0; i < N; i++) {
            ao = ao + A[i];
            go = go * A[i];
            ho = ho + 1 / A[i];
            kho = (int) (kho + Math.pow(A[i], 2));

        }
        kho = kho / ao;
        ao = ao / N;
        go = (int) Math.pow(go, 1 / N);
        ho = N / ho;
        System.out.println("Aritmetik ortalama: " + ao);
        System.out.println("Geometrik ortalama: " + go);
        System.out.println("Harmonik ortalama: " + ho);
        System.out.println("Kontraharmonik ortalama: " + kho);

    }

}
