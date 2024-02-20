
import java.util.Scanner;

public class gradRadyan {

    public static void main(String[] args) {
        double derece, grad, radyan;
        Scanner klavye = new Scanner(System.in);
        System.out.println("Açıyı(D)giriniz :");
        derece = klavye.nextDouble();
        radyan = derece * 3.14 / 180;
        grad = derece * 200 / 180;
        System.out.println("Grad  :" + grad);
        System.out.println("Radyan  :" + radyan);
    }

}
