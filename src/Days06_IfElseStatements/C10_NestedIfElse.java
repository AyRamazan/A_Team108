package Days06_IfElseStatements;

import java.util.Scanner;

public class C10_NestedIfElse {
    public static void main(String[] args) {

         /*
        Kullanicidan aldigi urun adedi ve liste fiyatini alin,
        kullaniciya musteri karti olup olmadigini sorun,
        Musteri kartı varsa 10 urunden fazla alirsa %20, yoksa % 15 indirim yapin,
        müsteri karti yoksa 10 urunden fazla alirsa % 15, yoksa % 10 indirim yapin,
         */


        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen aldiginiz urun adedini giriniz");
        int urunAdedi= scan.nextInt();

        System.out.println("Lütfen ürünün liste fiyatini giriniz");
        double listeFiyati= scan.nextDouble();

        System.out.println("Musteri kartiniz var mi \n E:Evet H:Hayir");
        char kartVarmi=scan.next().charAt(0);

        // kart ana degisken olsun

        if (kartVarmi=='E' || kartVarmi=='e'){ //kart var
            if (urunAdedi<=0) System.out.println("gecersiz urun miktari");
            else if (urunAdedi>10) System.out.println("% 20 indirimli toplam fiyat : " +(urunAdedi*listeFiyati*0.8));
            else System.out.println("% 15 indirimli toplam fiyat : " + (urunAdedi*listeFiyati*0.85));
        } else if (kartVarmi== 'H' || kartVarmi== 'h') { // kart yok
            if (urunAdedi<=0) System.out.println("Gecersiz urun miktari");
            else if (urunAdedi>10) System.out.println("% 15 indirimli toplam fiyat : " + (urunAdedi*listeFiyati*0.85));
            else System.out.println("% 10 indirimli toplam fiyat : "+ (urunAdedi*listeFiyati*0.9));

        }else System.out.println("kart bilgisi gecersiz"); // hatali kart bilgisi


    }
}
