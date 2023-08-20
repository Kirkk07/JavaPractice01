package Interfaces;

public class Main {
    public static void main(String[] args) {
        // Interface ve Abstact classlar inherit edildiginde newlenemezler

        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
        customerManager.add();

    }
}
