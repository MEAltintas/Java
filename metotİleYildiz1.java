
public class metotİleYildiz1 {

    static void yildiz_uret1(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        yildiz_uret1(5);
    }

}
