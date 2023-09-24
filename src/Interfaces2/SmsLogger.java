package Interfaces2;

public class SmsLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Sms logged "+ message);
    }
}
