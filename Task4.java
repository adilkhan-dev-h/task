import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите возраст: ");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Некорректный возраст");
        } else if (age < 18) {
            System.out.println("Вы несовершеннолетний");
        } else {
            System.out.println("Вы совершеннолетний");
        }
    }
}