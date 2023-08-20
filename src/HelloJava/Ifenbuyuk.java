package HelloJava;

public class Ifenbuyuk {
    public static void main(String[] args){
        int n1=20;
        int n2=25;
        int n3=26;
        int enBuyuk=n1;
        if(enBuyuk<n2){
            enBuyuk=n2;
        }
        if(enBuyuk<n3){
            enBuyuk=n3;
        }
        System.out.println("En buyuk : "+ enBuyuk);
    }
}
