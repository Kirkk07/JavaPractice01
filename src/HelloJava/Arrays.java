package HelloJava;

public class Arrays {
    public static void main(String[] args) {

        String[] ogrenciler= new String[3];
        String o1="Hasan";
        String o2="Daniel";
        String o3="Ihsan";
        ogrenciler[0]=o1;
        ogrenciler[1]=o2;
        ogrenciler[2]=o3;


        int length = ogrenciler.length;
        for(int i = 0;i<ogrenciler.length;i++){
            System.out.println(i+": "+ogrenciler[i]);
        }
        for (String ogrenci: ogrenciler) {
            System.out.println(ogrenci);


        }


    }
}
