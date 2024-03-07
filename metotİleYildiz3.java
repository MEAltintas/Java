
public class metotİleYildiz3 {

    static void yildiz_uret3(int N) {
        int bosluk = N - 1;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= bosluk; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= N - bosluk; j++) {
                System.out.print("*");

            }
            bosluk--;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        yildiz_uret3(5);
    }

}
