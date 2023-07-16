package Days02_Variables_scanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {

        /*
        Kullanicidan bir dikdörtgenin 2 kenar uzunlugunu alip,
        dikdörtgenin alanini yazdirin
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen dikdörtgenin iki kenar uzunlugunu giriniz");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();

        System.out.println("dikdörtgenin alani: "+(kenar1*kenar2));
    }
}
