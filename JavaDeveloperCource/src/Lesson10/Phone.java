package Lesson10;

public abstract class Phone<T> implements Callable<T>, Informable<T> {

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

    public void receiveCall(T name) throws NameException {

        if (name.toString().length() < 4) {
            throw new NameException("Длина имени должна быть больше четырех символов!", name.toString());
        }
        System.out.println("Звонит " + name);
    }

}