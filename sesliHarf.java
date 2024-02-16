
import java.util.Scanner;

public class sesliHarf {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cümle giriniz: ");
        String cumle = input.nextLine();
        cumle = cumle.toLowerCase();
        char[] sesli = {'a', 'e', 'ı', 'i', 'o', 'ö', 'u', 'ü'};
        int sayac = 0;
        int[] yer = new int[255];
        for (int i = 0; i < cumle.length(); i++) {
            for (int j = 0; j < sesli.length; j++) {
                if (cumle.charAt(i) == sesli[j]) {
                    yer[sayac] = i + 1;
                    sayac++;
                }

            }

        }
        System.out.println("Toplam ünlü sayısı: " + sayac);
    }
}
