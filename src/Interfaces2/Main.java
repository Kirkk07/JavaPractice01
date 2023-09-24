package Interfaces2;


public class Main {
    public static void main(String[] args){
        Logger[] loggers={new SmsLogger(), new DatabaseLogger(),new FileLogger()};
        CustomerManager customerManager=new CustomerManager(loggers);
        Customer Hasan=new Customer(1,"Hasan","Kork");
        customerManager.add(Hasan);
    }
}
