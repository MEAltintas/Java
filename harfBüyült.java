
import java.util.Scanner;

public class harfBüyült {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Küçük harf giriniz: ");
        String harf = input.nextLine();
        System.out.println(harf.toUpperCase());
    }
}
