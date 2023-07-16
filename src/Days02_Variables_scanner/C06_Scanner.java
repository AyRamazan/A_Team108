package Days02_Variables_scanner;

import java.util.Scanner;

public class C06_Scanner {

    public static void main(String[] args) {

        // Kullanicidan bir sayi isteyin ve sayinin karesini yazdirin

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen bir sayi giriniz");

        double girilenSayi= scan.nextDouble();

        System.out.println("girilen sayinin karesi= "+girilenSayi*girilenSayi);

    }
}
