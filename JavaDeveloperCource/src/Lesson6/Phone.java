package Lesson6;

public class Phone {

    private String number;
    private String model;
    private int weight;

    public Phone(){
    }

    public Phone(String number, String model){
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, int weight){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String name){
        System.out.println("Звонит " + name);
    }

    public String getNumber(){
        return this.number;
    }
    public String getModel(){
        return this.model;
    }
    public int getWeight(){
        return this.weight;
    }
}