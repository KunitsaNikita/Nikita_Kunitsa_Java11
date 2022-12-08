package TestTask;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String name = "Привет";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, если ввести больше 7, то появится текст, если 7 или меньше 7, то текст не появится ");
        int someNumber = scanner.nextInt();
        if (someNumber > 7) {
            System.out.println(name);
            System.out.print("Число больше 7, поэтому текст выводится");
        } else if (someNumber == 7) {
            System.out.println("Число равно 7, поэтому текст  не выведется ");
        } else {
            System.out.println("Число меньше 7, поэтому текст не выведется ");
        }
    }
}
