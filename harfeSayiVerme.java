
import java.util.Scanner;

public class harfeSayiVerme {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cümle giriniz: ");
        String cumle = input.nextLine();
        for (int i = 0; i < cumle.length(); i++) {
            System.out.print(cumle.charAt(i) + "" + (i + 1));

        }
    }

}
