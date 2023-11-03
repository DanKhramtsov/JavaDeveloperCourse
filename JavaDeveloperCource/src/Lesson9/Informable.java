package Lesson9;

public interface Informable<S> {

    public default void info(Phone<S> phone) {
        System.out.printf("Модель телефона: %s,\tвес: %d,\tномер телефона: %s\t\n",
                phone.getModel(), phone.getWeight(), phone.getNumber());

    }
}
