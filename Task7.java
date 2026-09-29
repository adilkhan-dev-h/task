import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = sc.nextInt();

        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("Число делится на 3 и на 5");
        } else if (n % 3 == 0) {
            System.out.println("Число делится только на 3");
        } else if (n % 5 == 0) {
            System.out.println("Число делится только на 5");
        } else {
            System.out.println("Число не делится ни на 3, ни на 5");
        }
    }
}