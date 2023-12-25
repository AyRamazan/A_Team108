package Days11_ForLoops;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {

        /*
        Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        sinirlar dahil olarak aralarindaki tum sayilarin toplaminin yazdirin
        Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen baslangic icin pozitif bir sayi giriniz ");
        int BaslangicSayi= scan.nextInt();

        System.out.println("Lutfen bitis icin pozitif bir sayi giriniz");
        int BitisSayi= scan.nextInt();

        int ToplamSayi= 0;

        if (BitisSayi<BaslangicSayi){
            System.out.println("Yanlis islem");
        }

        for (int i = BaslangicSayi; i < BitisSayi; i++) {
            ToplamSayi+=i;

        }
        System.out.println("Sayilarin toplami : " + ToplamSayi+" ");





    }
}
