package HelloJava;

public class ArraysDouble {
    public static void main(String[] args) {
        double[] myList = new double[5];
        double total = 0;
        double max = myList[0];
        double[] myList2 = {1.2, 1.3, 1.5, 1.6, 1.8, 1.9};
        for (double num : myList2) {
            total = total + num;
            if (max < num) {
                max = num;
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Total: " + total);
       /* for (double num:myList) {
            System.out.println(num);
        }*/
        String[][] city=new String[3][3];
        city[0][0]="Istanbul";
        city[0][1]="Bursa";
        city[0][2]="Bilecik";
        city[1][0]="Ankara";
        city[1][1]="Corum";
        city[1][2]="Yozgat";
        city[2][0]="Antep";
        city[2][1]="MArdin";
        city[2][2]="Diyarbekir";

         for (int i=0; i<=2 ;i++){
             System.out.println("--------");
             for (int j=0;j<=2;j++){
                 System.out.println(city[i][j]);
             }
         }
    }
}
