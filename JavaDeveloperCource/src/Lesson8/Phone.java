package Lesson8;

public abstract class Phone implements Callable {

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

    @Override
    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

}