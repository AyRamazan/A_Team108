package Days03_DataCansting_Matematikselİslemler;

import java.util.Scanner;

public class C04_CharDataCasting {

    public static void main(String[] args) {

        /*

        Char data turu'nun ekstra bir ozelligi vardir
        eger matematiksel bir islemde char data turunden bir deger kullanirsaniz
        Java o char'in ascii degerini gozonunde bulundurarak matematiksel islemi gerceklestirir

         */

        System.out.println('a'+'b');//195

        System.out.println('a'-32);//65

        // 'a'-32'nin char olarak sonucunu yazdirin

        System.out.println((char)('a'-32));

        /*
        Kullanicidan bir char alip ascii table'dan kullanicinin girdigi char'in sonrasindaki 3 karakteri yazdirin
        -3 karakteri yazdirin
        -ornek input  : a output: b,c,d

         */

        Scanner scan= new Scanner(System.in);

        System.out.println("lütfen bir karakter giriniz");

        char girilenKarakter= scan.next().charAt(0);

        System.out.println((char)(girilenKarakter+1)+ ","
                          +(char) (girilenKarakter+2)+","
                          +(char) (girilenKarakter+3));

    }
}
