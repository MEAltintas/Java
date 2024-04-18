
import java.util.Scanner;

public class metotİleDiziTopla {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Satır sayısı: ");
        int n = input.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("A nın " + (i + 1) + "\'nci elemanı giriniz: ");
            a[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("B nin " + (i + 1) + "\'nci elemanı giriniz: ");
            b[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c[i] = a[i] + b[i];
        }
        diziTopla(n, c);
    }

    static void diziTopla(int n, int[] c) {
        for (int i = 0; i < n; i++) {
            System.out.println(c[i]);
        }
    }

}
