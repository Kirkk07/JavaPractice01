package Interfaces2;

public class Main {
    public static void main(String[] args){
        CustomerManager customerManager=new CustomerManager();
        Customer Hasan=new Customer(1,"Hasan","Kork");
        customerManager.add(Hasan);
    }
}
