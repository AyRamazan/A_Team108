package Days05_IfStatements;

import java.util.Scanner;

public class C06_IfStatements {
    public static void main(String[] args) {

        /*
        Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        ucgen eskenar ise "Eskenar ucgen " yazdirin
         */


        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen ucgene ait 3 kenar uzunlugunu giriniz");

        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        if (kenar1==kenar2 && kenar2==kenar3 && kenar1>0){
            System.out.println("Eskenar Ucgen");
        } else {
            System.out.println("Eskenar ucgen degil");
        }






    }
}
