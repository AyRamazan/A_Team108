package Days07_Ternary_SwitchStatements;

import java.util.Scanner;

public class C02_IfElseIf {
    public static void main(String[] args) {


        /*
        Kullanicidan bir tamsayi alin
        sayi negatif ise "negatif sayi"
        sayi rakam ise "girilen sayi rakam"
        girilen sayi 2 basamakli ise "girilen sayi 2 basamakli"
        sayi 2 basamaktan buyuk ise "buyuk sayi" yazdirin

         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz");
        int girilenSayi= scan.nextInt();

        if (girilenSayi<0) System.out.println("girilen sayi negatif");
        else if (girilenSayi<=0 && girilenSayi<=9) System.out.println("girilen sayi rakam");
        else if (girilenSayi<=10 && girilenSayi<=99) System.out.println("girilen sayi 2 basamakli");
        else if (girilenSayi>=100) System.out.println("girilen sayi buyuk sayi");
        else System.out.println("gecersiz sayi");

        /*
        if (girilenSayi<0) System.out.println("girilen sayi negatif");
        else if (girilenSayi<=9) System.out.println("girilen sayi rakam");
        else if (girilenSayi<=99) System.out.println("girilen sayi 2 basamakli");
        else System.out.println("buyuk sayi");

         */


    }
}
