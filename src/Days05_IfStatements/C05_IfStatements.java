package Days05_IfStatements;

import java.util.Scanner;

public class C05_IfStatements {
    public static void main(String[] args) {

        /*

        Soru:
        Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        Not: Buyuk harf kucuk harf hassasiyeti olmasın
        Kullanici o veya O yazdiginda output Ocak olsun

         */


        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen yazdirmak istediginiz ayin ilk harfini giriniz");

        char ilkharf= scan.next().charAt(0);

        if (ilkharf=='o'|| ilkharf=='O') System.out.println("Ocak");
        if (ilkharf=='s'|| ilkharf=='S') System.out.println("Subat");
        if (ilkharf=='m'|| ilkharf=='M') System.out.println("Mart veya Mayis");
        if (ilkharf=='n'|| ilkharf=='N') System.out.println("Nisan");
        if (ilkharf=='h'|| ilkharf=='H') System.out.println("Haziran");
        if (ilkharf=='t'|| ilkharf=='T') System.out.println("Temmuz");
        if (ilkharf=='a'|| ilkharf=='A') System.out.println("Agustos veya Aralik");
        if (ilkharf=='e'|| ilkharf=='E') System.out.println("Eylül veya Ekim");
        if (ilkharf=='k'|| ilkharf=='K') System.out.println("Kasim");













    }
}
