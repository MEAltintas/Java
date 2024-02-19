
import java.util.Scanner;

public class usAlma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir n değeri giriniz: ");
        int n1 = input.nextInt();
        System.out.println("Bir n değeri giriniz: ");
        int n2 = input.nextInt();
        System.out.println(Math.pow(n1, n2));
    }

}
