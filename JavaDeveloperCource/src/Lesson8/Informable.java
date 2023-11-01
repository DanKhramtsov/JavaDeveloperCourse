package Lesson8;

public interface Informable {

    public default void info(Phone phone) {
        System.out.printf("Модель телефона: %s,\tвес: %d,\tномер телефона: %s\t\n",
                phone.getModel(), phone.getWeight(), phone.getNumber());

    }
}
