/*
Д/з создать в проекте с Phone интерфейсы: Callable с методом receiveCall() и Informable c default методом info()
с default реализацией, применить интерфейсы к абстрактному классу Phone и классам-наследникам.
 */

package Lesson8;

public class Main {

    public static void main(String[] args) {

        ApplePhone applePhone = new ApplePhone("+71234567890", "IPhone 15", 100);
        applePhone.receiveCall("Николай");
        applePhone.info(applePhone);

        SamsungPhone samsungPhone = new SamsungPhone("+71234567000", "S21", 120);
        samsungPhone.receiveCall("Юрий");
        samsungPhone.info(samsungPhone);

        XiaomiPhone xiaomiPhone = new XiaomiPhone("+71234533333", "Redmi 3", 130);
        xiaomiPhone.receiveCall("Ольга");
        xiaomiPhone.info(xiaomiPhone);

    }
}
