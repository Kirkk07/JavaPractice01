package HelloJava;

import java.util.Scanner;

public class KalinSesliinceSesliHarf {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String harf= sc.nextLine();
        harf.toLowerCase();
        switch(harf){
            case "a":
            case "u":
            case "o":
            case "i":
                System.out.println("Kalin harf");

        }


    }
}
