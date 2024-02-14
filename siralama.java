
import java.util.Scanner;

public class siralama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int a = input.nextInt();
        System.out.println("Bir sayı daha giriniz: ");
        int b = input.nextInt();
        System.out.println("Son olarak bir sayı daha giriniz: ");
        int c = input.nextInt();
        if (a > b & b > c) {
            String siralama = "a>b>c";
            System.out.println("En büyük sayı: " + a + " Sıralama: " + siralama);
        } else if (b > a & a > c) {
            String siralama = "b>a>c";
            System.out.println("En büyük sayı: " + b + " Sıralama: " + siralama);
        } else {
            String siralama = "c>a>b";
            System.out.println("En büyük sayı: " + c + " Sıralama: " + siralama);
        }
    }

}
