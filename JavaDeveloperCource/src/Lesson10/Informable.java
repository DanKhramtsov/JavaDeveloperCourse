package Lesson10;

public interface Informable<T> {

    public default void info(Phone<T> phone) {
        System.out.printf("Модель телефона: %s,\tвес: %d,\tномер телефона: %s\t\n",
                phone.getModel(), phone.getWeight(), phone.getNumber());

    }
}
