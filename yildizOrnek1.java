
import java.util.Scanner;

public class yildizOrnek1 {

    /*
    
    *
    **
    ***
    ****
    ***
    **
    *
    
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir N değeri giriniz: ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < (n + 1) - i; j++) {
                System.out.print("*");

            }
            System.out.println("");
        }
    }

}
