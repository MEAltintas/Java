
import java.util.Stack;

public class fibonacciPushMetodu {

    public static void main(String[] args) {
        Stack<Double> s1 = new Stack();
        double n1, n2;
        for (double i = 0; i < 100; i++) {
            if (i == 0 || i == 1)//if(i<2)
            {
                s1.push(i);
            } else {
                n1 = s1.pop();
                n2 = s1.pop();
                s1.push(n2);
                s1.push(n1);
                s1.push(n1 + n2);
            }
            System.out.println(s1.peek());
        }
    }
}
