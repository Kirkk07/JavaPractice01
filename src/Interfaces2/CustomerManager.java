package Interfaces2;

import PoymorphismDemo.DataBaseLogger;

public class CustomerManager {
    public void add(Customer customer){
        System.out.println("Musteri eklendi"+ customer.getFirstName());
        DatabaseLogger databaseLogger=new DatabaseLogger();
        databaseLogger.log(customer.getFirstName()+" Veri tabanina Loglandi");
    }
    public void delete(Customer customer){
        System.out.println("Musteri silindi"+ customer.getFirstName());
    }
}
