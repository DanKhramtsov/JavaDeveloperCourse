/*   Д/з: Необходимо написать простой консольный калькулятор на Java.
 *   Для считывания ввода нужно использовать класс Scanner.
 *   В конце напечатать результат. Используйте форматированный вывод.
 *   Пока пусть работает так: пользователь вводит целые числа,
 *   а на вывод передается результат 4-х операций(+, -, *, /) без выбора операции.
 *   В дальнейшем будете дорабатывать приложение.
 */

package Lesson3;

import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два целых числа для вычислений");
        System.out.print("Первое число: ");
        int x = scanner.nextInt();
        System.out.print("Второе число: ");
        int y = scanner.nextInt();
        System.out.printf("Сложение = %d \nВычитание = %d \nУмножение = %d \nДеление = %d\n",
                x + y, x - y, x * y, x / y);
    }
}
