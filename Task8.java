import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Первое число: ");
        double a = sc.nextDouble();
        System.out.print("Оператор: ");
        String op = sc.next();
        System.out.print("Второе число: ");
        double b = sc.nextDouble();

        if (op.equals("+")) {
            System.out.println("Результат: " + (a + b));
        } else if (op.equals("-")) {
            System.out.println("Результат: " + (a - b));
        } else if (op.equals("*")) {
            System.out.println("Результат: " + (a * b));
        } else if (op.equals("/")) {
            if (b == 0) {
                System.out.println("Ошибка: на ноль делить нельзя");
            } else {
                System.out.println("Результат: " + (a / b));
            }
        } else {
            System.out.println("Неизвестный оператор");
        }
    }
}