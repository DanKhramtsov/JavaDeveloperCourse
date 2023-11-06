package Lesson10;

public interface Callable<T>{

    public void receiveCall(T name) throws NameException;

}
