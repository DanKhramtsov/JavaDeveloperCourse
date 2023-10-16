/*        Д/з: создать приложение запрашивающее у пользователя наименование товара, количество,
 *       телефон пользователя и адрес. В консоль выводит информацию о заказе, в виде
 *       Ваш заказ принят. Товар <Наименование товара> в количестве <количество> прибудет
 *       к вам в ближайшее время. Товар доставим по адресу: <адрес>. Ваш контактный номер: <телефон>.
 */

package Lesson2;

import java.util.Scanner;

public class Goods {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите наименование товара: ");
        String product = scanner.nextLine();

        System.out.print("Укажите количество: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Укажите ваш контактный телефон: ");
        String phoneNumber = scanner.nextLine();    // Переменная типа String для того,
        // если пользователь введет символ "+" в номере телефона

        System.out.print("Укажите адрес для доставки: ");
        String address = scanner.nextLine();

        scanner.close();
        System.out.printf("Ваш заказ принят.\nТовар %s в количестве %d прибудет к вам в ближайшее время.\n" +
                "Товар доставим по адресу: %s. \nВаш контактный номер: %s", product, quantity, address, phoneNumber);
    }
}
