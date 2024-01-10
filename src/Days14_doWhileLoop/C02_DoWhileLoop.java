package Days14_doWhileLoop;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {
        // Kullanicidan istedigi kadar sayi alin
        // kullanici deger olarak 0'a basarsa islemi bitirin

        Scanner scan=new Scanner(System.in);
        int girilenSayi=0;
        int toplam=0;

        do {
            System.out.println("Lutfen toplanmak icin tamsayi giriniz");
            girilenSayi= scan.nextInt();
            toplam+=girilenSayi;

        }while (girilenSayi!=0);

        System.out.println("Girilen sayilarin toplami :" +toplam);

        /*
        While loop da eger ilk sart saglanmazsa loop body hic calismaz
        Do-While Loop'da onca body calisdigi icin sart yanlis olsa bile loop body'si en az 1 kere calismis olur
         */
    }
}
