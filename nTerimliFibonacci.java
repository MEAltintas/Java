import java.util.Scanner;

public class Fibonacci {
    // Fibonacci serisini hesaplayan yöntem
    static void printFibonacci(int n) {
        int num1 = 0, num2 = 1;

        System.out.print("Fibonacci Serisi: " + num1 + " " + num2);

        for (int i = 2; i < n; i++) {
            int next = num1 + num2;
            System.out.print(" " + next);
            num1 = num2;
            num2 = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç terim istiyorsunuz?: ");
        int n = scanner.nextInt();

        // Kullanıcıdan alınan n değeri kadar Fibonacci serisi yazdırılır
        if (n >= 2) {
            printFibonacci(n);
        } else {
            System.out.println("Lütfen en az 2 giriniz.");
        }

        scanner.close();
    }
}
