/*
*   ДЗ: Доработать калькулятор, получение от пользователя действия, которое нужно выполнить.
*   Можно получить таким образом - если пользователь вводит 1, то это сложение, 2 - разность и т.д.
*   Вывести результат действия. Используйте конструкции if -else, case.
*/

package Lesson4;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два целых числа для вычислений");
        System.out.print("Первое число: ");
        int x = scanner.nextInt();
        System.out.print("Второе число: ");
        int y = scanner.nextInt();
        System.out.println("Выберите операцию: \n1 - сложение\n2 - вычитание\n3 - умножение\n4 - деление");
        int operation = scanner.nextInt();
        scanner.close();

        String result = "Результат: ";

        switch (operation) {
            case (1) :
                System.out.println(result + (x + y));
                break;
            case (2) :
                System.out.println(result + (x - y));
                break;
            case (3) :
                System.out.println(result + (x * y));
                break;
            case (4) :
                System.out.println(result + (x / y));
        }
    }
}
