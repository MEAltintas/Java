import java.util.Scanner;
import java.util.Stack;

public class ParenthesesBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir dizge girin: ");
        String input = scanner.nextLine();

        if (isBalanced(input)) {
            System.out.println("Parantezler dengelidir.");
        } else {
            System.out.println("Parantezler dengesizdir.");
        }
    }

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false;

                char last = stack.pop();
                if ((ch == ')' && last != '(') ||
                    (ch == '}' && last != '{') ||
                    (ch == ']' && last != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
