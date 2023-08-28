package Days07_Ternary_SwitchStatements;

import java.util.Scanner;

public class C01_IfElseIf {

    public static void main(String[] args) {

        /*
        Kullanicidan bir tamsayi alin
        sayi rakam ise "girilen sayi rakam"
        girilen sayi 2 basamakli ise "girilen sayi 2 basamakli"
        sayi 2 basamaktan buyuk ise "buyuk sayi" yazdirin


        Eger if else cumleleri ELSE ile bitmiyorsa tum durumlari kapsamaz
        yani bazi degerler icin hicbir if bodysi calismayabilir
        Bu tur sorulari cozerken sartlarin tamamini  dikkatli yazmak gerekir

         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz");
        int girilenSayi= scan.nextInt();

        if (girilenSayi==0 && girilenSayi<=9) System.out.println("girilen sayi rakam");
        else if (girilenSayi>9 && girilenSayi<=99) System.out.println("girilen sayi 2 basamakli");
        else if (girilenSayi>=100) System.out.println("girilen sayi buyuk sayi");
        else {
            System.out.println("gecersiz sayi girdiniz");
     }



        /*
        if (0<=girilenSayi && girilenSayi<=9) System.out.println("girilen sayi rakam");
        else if (10<=girilenSayi && girilenSayi<=99) System.out.println("girilen sayi 2 basamakli");
        else if (100<=girilenSayi) System.out.println("buyuk sayi");

        */



    }
}
