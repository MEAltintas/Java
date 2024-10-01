import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayıyı girin: ");
        double num1 = scanner.nextDouble();
        System.out.print("İkinci sayıyı girin: ");
        double num2 = scanner.nextDouble();
        System.out.print("Yapmak istediğiniz işlemi seçin (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.printf("Geçersiz işlem: %s", operator);
                return;
        }
        System.out.printf("Sonuç: %.2f", result);
    }
}
