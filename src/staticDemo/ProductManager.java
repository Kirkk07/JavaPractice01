package staticDemo;

public class ProductManager {
    public  void add(Product product){
        ProductValidator validator=new ProductValidator();
        validator.dummy();
        if(validator.isValid(product)){
            System.out.println("Eklendi");
        }else{
            System.out.println("Urun bilgileri gecersiz");
        }
// Urun fiyati ve adi istenilen seviyede ise sisteme eklendi islemi yaouldu
        // Manager siniflari /static yapilmaz

    }
}
