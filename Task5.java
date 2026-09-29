import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите оценку: ");
        int mark = sc.nextInt();

        if (mark == 5) {
            System.out.println("Отлично");
        } else if (mark == 4) {
            System.out.println("Хорошо");
        } else if (mark == 3) {
            System.out.println("Удовлетворительно");
        } else if (mark == 2) {
            System.out.println("Неудовлетворительно");
        } else if (mark == 1) {
            System.out.println("Очень плохо");
        } else {
            System.out.println("Некорректная оценка");
        }
    }
}