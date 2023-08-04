package Days06_IfElseStatements;

import java.util.Scanner;

public class C02_IfElseStatements {
    public static void main(String[] args) {
        /*
        Kullanicidan bir ücgenin 3 kenar uzunlugunu alin,
        ucgen ikizkenar ise "Ikizkenar Ucgen" yazdirin, degilse "Ikizkenar degil" yazdirin
         */


        Scanner scan= new Scanner(System.in);

        System.out.println("lütfen ücgenin kenar uzunluklarini giriniz");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        if ((kenar1==kenar2 && kenar1!=kenar3 ) ||
            (kenar2==kenar3 && kenar2!=kenar1 ) ||
            (kenar3==kenar1 && kenar3!=kenar2)) {

            System.out.println("ikizkenar ucgen");
        }else {
            System.out.println("ikizkenar degil");

        }
    }
}
