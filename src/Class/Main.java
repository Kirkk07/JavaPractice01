package Class;

public class Main {
    public static void main(String[] args){
        CustomerManager customerManager=new CustomerManager();
        customerManager.MusteriDondur();
        customerManager.MusteriEkle();
        customerManager.MusteriSil();
        customerManager.Musteri();

        int[] sayilar1={1,2,3};
        int[] sayilar2=new int[]{4,5,6};
        sayilar2=sayilar1;
        sayilar1[0]=10;
        System.out.println(sayilar2[0]);
    }
}
