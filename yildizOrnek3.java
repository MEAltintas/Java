
import java.util.Scanner;

public class yildizOrnek3 {

    /*
    
    ****
     ***
      **
       *
    
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir n değeri giriniz: ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");

            }
            for (int k = 0; k < n - i; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

}
