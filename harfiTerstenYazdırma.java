
import java.util.Scanner;

public class harfiTerstenYazdırma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cümle giriniz: ");
        String cumle = input.nextLine();
        for (int i = cumle.length() - 1; i >= 0; i--) {
            System.out.print(cumle.charAt(i));

        }
    }

}
