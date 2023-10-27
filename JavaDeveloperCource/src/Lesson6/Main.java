package Lesson6;

public class Main {

    public static void main(String[] args) {

        Phone phone1 = new Phone("+7(999)012-45-67", "Iphone", 190);
        Phone phone2 = new Phone("+7(999)012-45-99", "Samsung",200);
        Phone phone3 = new Phone("+7(999)012-45-11","Nokia",170);


        phone1.printPhone();
        phone2.printPhone();
        phone3.printPhone();

        phone1.receiveCall("Николай");
        phone2.receiveCall("Ольга");
        phone3.receiveCall("Юрий");

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());

    }

}
