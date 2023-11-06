package Lesson10;

public class NameException extends Exception{

    String name;

    public NameException(String message, String name) {
        super(message);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
