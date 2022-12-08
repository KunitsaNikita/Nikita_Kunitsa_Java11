package TestTask;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите желаемую  длинну массива. Массив будет заполняться всеми целыми числами до 1 до введеного числа ");
        int number = scanner.nextInt();
        int x[] = new int[number];
        for (int i = 0; i < x.length; i++) {
            x[i] = i + 1;
        }
        for (int i = 0; i < x.length; i++) {
            if (x[i] % 3 == 0) {
                System.out.println(x[i] + " Делится на 3");
            }
        }
    }
}
