/*
 *   Задача по массиву: Дан одномерный массив из 50 элементов. Массив заполнен числами от -50 до 50.
 *   Найти количество отрицательных элементов, количество положительных элементов, количество нулей.
 *   Найти сумму всех положительных элементов и отрицательных элементов отдельно. Найти среднее по массиву.
 *   Массив можно заполнить случайными числами без использования ручного ввода, подумайте + погуглите, как это сделать.
 */

package Lesson4;

public class Array {

    public static void main(String[] args) {
        int[] array = new int[50];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (-50 + Math.random() * 100 + 1);
        }

        int negativeNumbersQuantity = 0, positiveNumbersQuantity = 0, zeroQuantity = 0;
        int positiveSum = 0, negatineSum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positiveSum = positiveSum + array[i];
                positiveNumbersQuantity++;
            } else if (array[i] < 0) {
                negatineSum = negatineSum + array[i];
                negativeNumbersQuantity++;
            } else {
                zeroQuantity++;
            }
        }
        System.out.printf("Количество отрицательных чисел: %d\nКоличество положительных чисел: %d\n" +
                        "Количество нулей: %d\nСумма всех отрицательных чисел: %d\nСумма всех положительных чисел: %d\n" +
                        "Средее арифметическое по массиву: %.2f\n", negativeNumbersQuantity, positiveNumbersQuantity,
                zeroQuantity, negatineSum, positiveSum, (float)((negatineSum + positiveSum)) / array.length);
    }
}
