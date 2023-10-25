package Lesson5;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите операцию: \n1 - сложение\n2 - вычитание\n3 - умножение\n4 - деление");
            int operation = scanner.nextInt();
            System.out.print("Введите первое число: ");
            int operand1 = scanner.nextInt();
            System.out.print("Введите второе число: ");
            int operand2 = scanner.nextInt();
            int result = 0;

            switch (operation) {
                case 1:
                    result = addition(operand1, operand2);
                    break;
                case 2:
                    result = subtraction(operand1, operand2);
                    break;
                case 3:
                    result = multiplication(operand1, operand2);
                    break;
                case 4:
                    result = division(operand1, operand2);
            }
            System.out.println(result);
        }
    }

    static int addition(int operand1, int operand2) {
        return operand1 + operand2;
    }

    static int subtraction(int operand1, int operand2) {
        return operand1 - operand2;
    }

    static int multiplication(int operand1, int operand2) {
        return operand1 * operand2;
    }

    static int division(int operand1, int operand2) {
        return operand1 / operand2;
    }
}