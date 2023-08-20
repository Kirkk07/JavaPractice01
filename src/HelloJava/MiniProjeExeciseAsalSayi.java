package HelloJava;

import java.util.Scanner;

public class MiniProjeExeciseAsalSayi {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Give the number: ");
        int num= sc.nextInt();
        int remainder= num%2;
        int kalan;
        int teller=0;
        boolean isPrime=true;
        if(num==1){
            System.out.println("Sayi Asal Degildir");
            return;
        }
        for(int i =2;i<num;i++){
            if(num%i==0){
                isPrime=false;
            }
        }
        if (isPrime){
            System.out.println("Sayi Asaldir");
        }else
            System.out.println("Asal Degildir");
      /*  for (int i=1; i<=num;i++){
            kalan=num/i;
            if (kalan==0){
                teller++;
            }
        }
        System.out.println(teller);
        if(teller==2){
            System.out.println("Sayi Asal Sayidir");
        }else
            System.out.println("Asal Degildir");*/

    }

}
