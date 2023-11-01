/*  Д/3 Доработать класс Phone. Сделать его абстрактным. Метод info() сделать абстрактным.
    Также добавить классы-наследники от Phone - SamsungPhone, XiaomiPhone и ApplePhone.
    Реализацию info() в каждом классе-наследнике. Создать объекты каждого класса-наследника
    и проверить метод Info().*/

package Lesson7;

public abstract class Phone {

    private String number;
    private String model;
    private int weight;

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public Phone(String number, String model, int weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public abstract void info();

}