package Lesson6;

public class Main {

    public static void main(String[] args) {

        Phone phone1 = new Phone("+7(999)012-45-67", "Iphone", 190);
        Phone phone2 = new Phone("+7(999)012-45-99", "Samsung",200);
        Phone phone3 = new Phone("+7(999)012-45-11","Nokia",170);

        printPhone(phone1);
        printPhone(phone2);
        printPhone(phone3);

        phone1.receiveCall("Николай");
        phone2.receiveCall("Ольга");
        phone3.receiveCall("Юрий");

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());

    }

    public static void printPhone(Phone phone) {
        System.out.printf("Модель телефона: %s,\tвес: %d,\tномер телефона: %s\t\n",
                phone.getModel(), phone.getWeight(), phone.getNumber());
    }

}
