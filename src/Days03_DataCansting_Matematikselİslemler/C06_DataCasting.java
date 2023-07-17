package Days03_DataCansting_Matematikselİslemler;

import java.util.Scanner;

public class C06_DataCasting {
    public static void main(String[] args) {

        /*
        Kullanicidan bir double bir tamsayi alin,
        double sayiyi ikinci sayiya bolun
        ve bolum isleminin sonucunun tamsayi kismini yazdirin
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir double sayi giriniz");

        double sayiDbl= scan.nextDouble();

        System.out.println("lütfen bir tamsayi giriniz");

        int sayiİnt= scan.nextInt();

        System.out.println((int) (sayiDbl/sayiİnt));
    }
}
