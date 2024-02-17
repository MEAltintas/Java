
import java.util.Scanner;

public class kacHarf {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cümle giriniz: ");
        String cumle = input.nextLine();
        System.out.println("Aramak istediğiniz harfi giriniz: ");
        char harf = input.nextLine().charAt(0);
        int sayac = 0;
        for (int i = 0; i < cumle.length(); i++) {
            if (Character.toUpperCase(cumle.charAt(i)) == Character.toUpperCase(harf)) {
                sayac++;
            }

        }
        System.out.println("Aratılan " + harf + " cümlede toplam " + sayac + " kadar geçmektedir. ");
    }
}
