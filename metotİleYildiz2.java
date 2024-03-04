
public class metotİleYildiz2 {

    static void yildiz_uret2(int N) {
        int bosluk = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= bosluk; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= N - bosluk; j++) {
                System.out.print("*");
            }
            bosluk++;
            System.out.println();

        }
    }

    public static void main(String[] args) {
        yildiz_uret2(5);
    }

}
