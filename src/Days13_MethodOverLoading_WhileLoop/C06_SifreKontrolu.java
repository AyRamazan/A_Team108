package Days13_MethodOverLoading_WhileLoop;

import java.util.Scanner;

public class C06_SifreKontrolu {
    public static void main(String[] args) {
        /*

        Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
        duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
        basariyla kaydedildi" yazdirin
        - ilk harf kucuk harf olmali
        - son karakter rakam olmali
        - sifre bosluk icermemeli
        - uzunlugu en az 10 karakter olmali

        // sifre kontrolunu bir method'da yapip true/false dondurun
        // main method'da donen sonucu kontrol edip
        // "basarili bir sekilde olusturuldu" yazincaya kadar sifreyi tekrar tekrar isteyin

         */

        Scanner scan= new Scanner(System.in);

        boolean tekrarSifreIste= true;
        String sifre= "";


        while (tekrarSifreIste){
            System.out.println("Lütfen sifrenizi giriniz");
            sifre=scan.nextLine();

            if(sifreKontrolEt(sifre)) {//sifre kontrolu true donerse sifre basarili demektir
                System.out.println("basari ile olusturuldu");
                //break;
                tekrarSifreIste = false;// break veya bu kod yazilabilir
            }
        }
    }

    public static boolean sifreKontrolEt(String sifre) {
        int flag = 0;


        if (!(sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z')) {
            System.out.println("ilk harf kucuk olmalı");
            flag++;
        }
        if (!(sifre.charAt(sifre.length() - 1) >= '0' && sifre.charAt(sifre.length() - 1) <= '9')) {
            System.out.println("Son karakter rakam olmalı");
            flag++;
        }

        if (sifre.contains(" ")) {
            System.out.println("sifre bosluk icermemeli");
            flag++;
        }
        if (!(sifre.length() >= 10)) {
            System.out.println("sifrenin uzunlugu en az 10 karakter olmalı");
            flag++;
        }
        if (flag == 0) {
            return true;
        }else {
            return false;
        }
    }
}
