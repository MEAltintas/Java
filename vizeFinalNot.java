
import java.util.Scanner;

public class vizeFinalNot {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ad-Soyad: ");
        String isim = input.nextLine();

        System.out.println("Öğrenci no: ");
        int no = input.nextInt();

        System.out.println("Vize notu giriniz: ");
        double vize = input.nextDouble();

        System.out.println("Final notu giriniz: ");
        double finall = input.nextDouble();

        double ort = (vize * 0.4) + (finall * 0.6);
        System.out.println(no + " numaralı " + isim + " adlı öğrencinin" + " ortalaması: " + ort);

    }
}
