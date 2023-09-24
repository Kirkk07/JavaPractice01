package Interfaces2;

public class DatabaseLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Data logged "+ message);
    }
}
