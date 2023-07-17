package Days03_DataCansting_Matematikselİslemler;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {

        System.out.println(28/5);//5

        //Java bir bolme isleminde iki int isleme giriyorsa sonucu int olarak verir

        int sayi1=25;
        int sayi2=6;

        System.out.println(sayi1/sayi2);

        double dbl=6;

        System.out.println(sayi1/dbl);

        /*

        Kullanicidan 2 tamsayi alin
        1. tam sayiyi 2. ye bolup sonucu ondalik olarak yazdirin

         */

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen birbirine bolmek icin iki tamsayi giriniz");
        int ilkSayi= scan.nextInt();
        int ikinciSayi= scan.nextInt();

        System.out.println("iki sayinin bölme sonucu:"+(double)ilkSayi/ikinciSayi);



    }
}
