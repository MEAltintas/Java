
public class transpoze {

    public static void main(String[] args) {
        int[][] dizi = {{2, 4}, {7, 2}, {8, 2}};
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 2; k++) {
                System.out.print("[" + dizi[i][k] + "]");

            }
            System.out.println();
        }
        System.out.println("********************");
        for (int i = 0; i < 2; i++) {
            for (int k = 0; k < 3; k++) {
                System.out.print("[" + dizi[k][i] + "]");

            }
            System.out.println();
        }

    }

}
