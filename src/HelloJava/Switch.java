package HelloJava;

public class Switch {
    public static void main(String[] args){
        char grade='A';
        switch (grade){
            case 'A':
                System.out.println("Mukemmel : Gectiniz");
                break;
            case 'B':
            case 'D':
                System.out.println("Cok guzel : Gectiniz");
                break;
            case 'C':
                System.out.println("Kaldiniz");
                break;
            default:
                System.out.println("Gecersiz not girdiniz");

        }
    }

}
