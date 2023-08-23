package Days06_IfElseStatements;

import java.util.Scanner;

public class C11_NestedIfElse {
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

        // Urun miktari ana degisken olsun

        if (urunAdedi>10){// urun adedi 10'dan fazla
            if (kartVarmi=='E' || kartVarmi=='e') System.out.println(" %20 indirimli toplam fiyat : "+(urunAdedi+listeFiyati*0.8));
            else if (kartVarmi=='H' || kartVarmi=='h') System.out.println(" %15 indirimli toplam fiyat : "+(urunAdedi+listeFiyati*0.85));
            else System.out.println("hatali kart bilgisi");

        } else if (urunAdedi>0) { //urun sayisi 0-10 arasinda
            if (kartVarmi=='E' || kartVarmi=='e') System.out.println(" %15 indirimli toplam fiyat : "+(urunAdedi+listeFiyati*0.85));
            else if (kartVarmi=='H' || kartVarmi=='h') System.out.println(" %10 indirimli toplam fiyat : "+(urunAdedi+listeFiyati*0.9));

        }else { // urun sayisi 0 veya daha az
            System.out.println("Hatali urun adedi");
        }
    }
}
