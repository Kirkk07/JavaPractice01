package staticDemo;

public class ProductValidator {
    static {
        System.out.println("Static Yapici Blok Calisti");
    }
    public ProductValidator(){
        System.out.println("Yapici Constructor blok calisti");
    }
    public static boolean isValid( Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        }else{
            return  false;
        }

    }
    public void dummy(){

    }
    public static class BaskaBirClass{
        public static void Sil(){

        }
    }
}
