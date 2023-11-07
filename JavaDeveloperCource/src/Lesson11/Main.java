/*
Д/з Напишите метод, который добавляет 500_000 элементов в ArrayList и LinkedList и измерьте время,
которое потрачено на это. Сравните результаты.
 */

package Lesson11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;


public class Main {

    private static final int COLLECTION_SIZE = 500_000;
    private static ArrayList<Integer> arrayList = new ArrayList<>(COLLECTION_SIZE);
    private static LinkedList<Integer> linkedList = new LinkedList<>();

    public static void main(String[] args) {

        int a = populateAnyCollection(arrayList);
        int b = populateAnyCollection(linkedList);

        if (a > b) {
            System.out.printf("%s выполняется быстрее, чем %s на %d миллисекунд",
                    linkedList.getClass().getSimpleName(), arrayList.getClass().getSimpleName(), a - b);
        } else {
            System.out.printf("%s выполняется быстрее, чем %s на %d миллисекунд",
                    arrayList.getClass().getSimpleName(), linkedList.getClass().getSimpleName(), b - a);
        }

    }

    public static int populateAnyCollection(Collection collection) {

        long startTimeCount = System.currentTimeMillis();

        for (int i = 0; i < COLLECTION_SIZE; i++) {
            collection.add((int) (Math.random() * 1000));
        }

        long endTimeCount = System.currentTimeMillis();

        int difference = (int) (endTimeCount - startTimeCount);
        String nameCollection = collection.getClass().getSimpleName();

        System.out.printf("Время заполнения %s составляет %d миллисекунд\n",
                nameCollection, difference);
        return difference;
    }

}