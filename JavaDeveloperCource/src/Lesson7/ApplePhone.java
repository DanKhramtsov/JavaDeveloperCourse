package Lesson7;

public class ApplePhone extends Phone{

    public ApplePhone(String number, String model, int weight) {
        super(number, model, weight);
    }

    @Override
    public void info() {
        System.out.printf("Модель телефона: %s,\tвес: %d,\tномер телефона: %s\t\n",
                getModel(), getWeight(), getNumber());
    }
}
