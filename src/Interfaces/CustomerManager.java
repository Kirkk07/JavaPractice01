package Interfaces;

public class CustomerManager {
    private ICustomerDal customerDal;
    public CustomerManager(ICustomerDal customerDal){
        this.customerDal=customerDal;

    }
    public void add(){
        // Is kodlari Yazilir parametre gonderilerek musteri kaydetme gibi;

        customerDal.Add();
    }
}
