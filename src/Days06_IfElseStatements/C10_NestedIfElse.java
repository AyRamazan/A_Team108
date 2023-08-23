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


    }
}
