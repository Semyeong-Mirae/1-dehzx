import java.util.Scanner;

interface Calculator {
    int add(int a, int b);

    default int multiply(int a, int b) {
        return a * b;
    }

    static int substract(int a, int b) {
        return a - b;
    }
}
class SimpleCalculator implements Calculator {
    @Override
    public int add(int a, int b) {
        return a+b;
    }
}
public class Main {
    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 두개 입력");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("덧셈: " + calc.add(a,b));
        System.out.println("곱셈: " + calc.multiply(a,b));
        System.out.println("뺄셈: " + Calculator.substract(a,b));
    }
}
