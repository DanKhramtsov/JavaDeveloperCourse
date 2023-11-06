/*
    Д/з добавить в проект Phone свой класс NameException, исправим метод receiveCall
    получаем имя от пользователя и получаем исключение, если длина имени меньше 4 символов.
 */

package Lesson10;


public class Main {

    public static void main(String[] args) throws NameException{

        Phone<String> applePhone = new ApplePhone("+71234567890", "IPhone 15", 100);
        applePhone.receiveCall("Николай");
        applePhone.info(applePhone);

        Phone<String> samsungPhone = new SamsungPhone("+71234567000", "S21", 120);
        samsungPhone.receiveCall("Юрий");
        samsungPhone.info(samsungPhone);

        Phone<String> xiaomiPhone = new XiaomiPhone("+71234533333", "Redmi 3", 130);
        xiaomiPhone.receiveCall("Ольга");
        xiaomiPhone.info(xiaomiPhone);


    }
}

