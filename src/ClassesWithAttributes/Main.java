package ClassesWithAttributes;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        System.out.println(product.get_name() );
        product.setId(15);
        product.set_description("Laptop");
        System.out.println(product.get_price());
        product.set_stockAmount(12);
        Product product1 = new Product(1,"A","B",15,120);
        System.out.println("P1: "+product1);

        ProductManager productManager=new ProductManager();
        productManager.Add(product);

        productManager.Add2(11,"Lenovo Laptop","Laptop",1,150);



    }
}
