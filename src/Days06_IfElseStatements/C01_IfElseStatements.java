package Days06_IfElseStatements;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {
        /*
        Kullanicidan bir ücgenin 3 kenar uzunlugunu alin,
        ucgen exkenar ise "Eşkenar Ucgen" yazdirin, degilse "Eskenar degil" yazdirin
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz");

        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        if (kenar1==kenar2 && kenar2==kenar3 && kenar1>0) {
            System.out.println("Eskenar ucgen");
        }else {
            System.out.println("Eskenar ucgen degil");
        }


        /*
        If ile baslayan bir kod else ile bitiyorsa
        input'un tum degerlerini kapsar
        Yani her deger icin mutlaka kodumuzda bir body calisir
         */
    }
}
