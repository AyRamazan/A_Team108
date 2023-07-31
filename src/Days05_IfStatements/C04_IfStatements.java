package Days05_IfStatements;

import java.util.Scanner;

public class C04_IfStatements {
    public static void main(String[] args) {

        /*

        if cumlelerinde sart parantezinden sonra body kullanmazsak
        ilk noktalı virgül'e kadar oan kısmi body olarak kabul eder
        Yani sadece bir satir kodu body olarak kabul eder

        Soru:
        Kullanicidan bir sayi alin,
        sayi 3 ile bolunuyorsa " 3 ile bolunebilen sayi",
        sayi 5 ile bolunuyorsa " 5 ile bolunebilen sayi", yazdirin


        Eger if body'si icin yazilacak kod 1 satirdan fazlaysa
        mutlaka {} kullanilmalidir

         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int girilenSayi= scan.nextInt();

        if (girilenSayi%3==0) System.out.println("3 ile bolunebilen sayi");

        if (girilenSayi%5==0) System.out.println("3 ile bolunebilen sayi");




    }
}
