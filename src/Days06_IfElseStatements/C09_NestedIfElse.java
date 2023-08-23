package Days06_IfElseStatements;

import java.util.Scanner;

public class C09_NestedIfElse {
    public static void main(String[] args) {

        /*
        Kullanicidan cinsiyetini ve yasini alin,
        Kadin, 60 yas ve uzeri, Erkek 65 yas ve uzeri emekli olabilir
        Cinsiyet ve yasini dikkate alarak "Emekli olabilirsin"
        veya "Emekli olmak icin ... yil daha calisman gerekiyor" yazdirin
         */

        /*
        Eger degisken sayimiz birden fazla ise
        degiskenlerden birini oncelige alarak ona göre bir if else yapisi kurulur.
        ornegin bu soruda kadin/erkek secimini ana degisken yapalim
         */



        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz\nK:Kadin, E: Erkek");
        char cinsiyet = scan.next().charAt(0);

        System.out.println("Lütfen tamsayi olarak yasinizi giriniz");
        int yas = scan.nextInt();

        if (cinsiyet == 'K' || cinsiyet == 'k') { // kadin olanlar icin bu bolum casilacak
            if (yas<18 || yas>80) System.out.println("gecersiz yas");
            else if (yas>=60) System.out.println("Emekli olabilirsin");
            else System.out.println("Emekli olmak icin : " + (60-yas) + " yil daha calismalisin");

        }else if (cinsiyet=='E' || cinsiyet== 'e') { // erkek olanlar icin bu bolum calisacak
            if (yas<18 || yas>80) System.out.println("gecersiz yas");
            else if (yas>=65) System.out.println("Emekli olabilirsin");
            else System.out.println("Emekli olmak icin : " + (65-yas) + " yil daha calismalisin");

        }else {
            System.out.println("cinsiyet bilgisi hatali");
        }
    }
}
