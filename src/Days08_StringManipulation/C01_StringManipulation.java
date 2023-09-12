package Days08_StringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class C01_StringManipulation {
    public static void main(String[] args) {

        /*

        Kullanicidan gun ismini girmesini isteyin,
        girilen gun hafta ici bir gun ise "Simdi calisma zamani tatile ... gun var"
        seklinde haftasonu tatiline kac gun kaldigini yazdirin
        girilen gun hafta sonu ise "Simdi dinlenme zamani" yazdirin

         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen gun ismini giriniz");
        String girilenGun= scan.next();
        String kullanilacakGun= girilenGun.toLowerCase();



        /*
        String ifadeler case sensitive'dir
        Kullanicidan Pazar, PAzar, PazaR, PAZAR ..... gibi 32 farkli sekilde yazma ihtimali var

        Kullanicinin girdigi degeri direk kalici olarak degistirmek tercih edilmez.
        Bunun yerine kullanicinin girdigi degeri degistirip yeni bir varible'a atama yapar,
        ve kodlarimizda yeni variable'a kullaniriz

        Konsola yazdiracagimiz zaman istersek kullanicinin girdigi orijinal metni yazdiririz
        istersek de bizim cevirdigimiz hali yazdiririz

         */


        switch (kullanilacakGun){
            case "pazartesi":
                System.out.println(girilenGun + "calisma zamani, tatile 5 gun var");
                break;
            case "sali":
                System.out.println(girilenGun + "calisma zamani, tatile 4 gun var");
                break;
            case "carsamba":
                System.out.println(girilenGun + "calisma zamani, tatile 3 gun var");
                break;
            case "persembe":
                System.out.println(girilenGun + "calisma zamani, tatile 2 gun var");
                break;
            case "cuma":
                System.out.println(girilenGun + "calisma zamani, tatile 1 gun var");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println(girilenGun + " simdi dinlenme zamani ");
                break;
            default:
                System.out.println("yanlis gun ismi");

        }
    }
}
