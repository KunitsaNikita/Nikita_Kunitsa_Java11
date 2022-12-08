package TestTask;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя. Если ввести имя не Вячеслав, то текст не появится ");
        String name = scanner.nextLine();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, " + name);
        } else {
            System.out.println("Имя " + name + " нету");
        }
    }
}

