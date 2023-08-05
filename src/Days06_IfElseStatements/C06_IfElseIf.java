package Days06_IfElseStatements;

import java.util.Scanner;

public class C06_IfElseIf {
    public static void main(String[] args) {

        /*
        Kullanicidan cinsiyetini ve yasini alin,
        Kadin, 60 yas ve uzeri, Erkek 65 yas ve uzeri emekli olabilir
        Cinsiyet ve yasini dikkate alarak "Emekli olabilirsin"
        veya "Emekli olmak icin ... yil daha calisman gerekiyor" yazdirin
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz\nK:Kadin, E: Erkek");
        char cinsiyet=scan.next().charAt(0);

        System.out.println("Lütfen tamsayi olarak yasinizi giriniz");
        int yas=scan.nextInt();

        if ((cinsiyet=='K' || cinsiyet== 'k') &&yas>=60 && yas<80){
            System.out.println("Kadin 60 yasindan buyuk oldugundan emekli olabilir");
        } else if ((cinsiyet=='K' || cinsiyet== 'k') && yas>=18 && yas<80){
            System.out.println("Emekli olmak icin " + (60-yas)+ "  yıl daha calismalisin");
        } else if ((cinsiyet=='K' || cinsiyet== 'k') && (yas<=18 && yas>80)){
            System.out.println("gecersiz yas");
        } else if ((cinsiyet=='E' || cinsiyet=='e') && yas>=65 && yas<80) {
            System.out.println("Erkek 65 yas ve üzeri oldugu icin emekli olabilir");
        } else if ((cinsiyet=='E' || cinsiyet=='e') && yas>18 && yas<80){
            System.out.println("Emekli olmak icin " +(65-yas)+ " yıl daha calismalisin");
        }else{
            System.out.println("gecersiz bilgi");
        }
    }
}
