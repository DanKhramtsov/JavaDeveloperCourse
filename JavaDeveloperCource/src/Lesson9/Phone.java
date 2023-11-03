package Lesson9;

public abstract class Phone<T> implements Callable<T>, Informable<Phone<T>> {

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

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(T name) {
        System.out.println("Звонит " + name);
    }

}