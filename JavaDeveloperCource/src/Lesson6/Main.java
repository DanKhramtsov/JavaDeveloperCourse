package Lesson6;

public class Main {

    public static void main(String[] args) {

        Phone phone1 = new Phone();
        phone1.model = "Iphone";
        phone1.number = "+7(999)012-45-67";
        phone1.weight = 190;

        Phone phone2 = new Phone();
        phone2.model = "Samsung";
        phone2.number = "+7(999)012-45-99";
        phone2.weight = 200;

        Phone phone3 = new Phone();
        phone3.model = "Nokia";
        phone3.number = "+7(999)012-45-11";
        phone3.weight = 170;

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
                phone.model, phone.weight, phone.number);
    }

}
