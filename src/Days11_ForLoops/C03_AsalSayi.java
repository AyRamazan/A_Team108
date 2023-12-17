package Days11_ForLoops;

import java.util.Locale;
import java.util.Scanner;

public class C03_AsalSayi {
    public static void main(String[] args) {

        /*
        input olarak verilen bir tamsayinin
        asal sayi olup olmadigini yazdirin

         */


        int input=4237;
        String sonuc="Sayi asal";

        for (int i = 2; i <input ; i++) {

            if (input%i==0){

               sonuc="Sayi asal degil";
               break;
                // Java bir loop'un icerisinde "break" gorurse
                // o loopu bitirir

            }
        }
        System.out.println(sonuc);

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        int numara= 9;

        switch (numara){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("perşembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default :
                System.out.println("gecersiz sayi");

        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen gün ismini giriniz");
        String girilecekGun= scan.next();
        String kullanilacakGun= girilecekGun.toLowerCase();

        switch (kullanilacakGun){
            case "pazartesi":
                System.out.println("Simdi calisma zamani tatile 5 gün var");
                break;
            case "sali":
                System.out.println("Simdi calisma zamani tatile 4 gün var");
                break;
            case "carsamba":
                System.out.println("Simdi calisma zamani tatile 3 gün var");
                break;
            case "persembe":
                System.out.println("Simdi calisma zamani tatile 2 gün var");
                break;
            case "cuma":
                System.out.println("Simdi calisma zamani tatile 1 gün var");
                break;
            case "cumartesi":
                System.out.println("Simdi tatil zamani");
                break;
            case "pazar":
                System.out.println("Simdi tatil zamani");
                break;
            default:
                System.out.println("yanlis gün ismi");


        }
    }
}