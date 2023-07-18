package Days04_Icrement_Concatenation;

public class C01_Pre_PostIncrement {

    public static void main(String[] args) {

        int sayi=20;

        //sayiyi 3 arttirin

        sayi= sayi+3;
        sayi+=3;

        sayi++;
        sayi++;
        sayi++;

        System.out.println(sayi);


        //sayinin degerini 2 azaltin

        sayi= sayi-2;

        sayi-=2;

        sayi--;
        sayi--;

        System.out.println(sayi);


        // sayinin degerini 1 azaltin ve yazdirin

        sayi--;
        System.out.println(sayi);

        sayi=10;
        //sayiyi önce yazdirin sonra 1 azaltin
        System.out.println(sayi);
        sayi--;

        //ekranda gorulen 10 ama sayinin son degeri 9


        sayi=10;
        System.out.println(sayi++);
        //java ayni satirda iki islem oldugundan siralama yapar
        //eger ++ variable'dan sonra ise artirma islemini sonra yapar
        //bu durumda once yazdirma, sonra artirma islemi yapar

        System.out.println(sayi);

        sayi=10;
        System.out.println(++sayi);
        //++ variable'den once ise artirma islemini once yapar
        // bu durumda java once artirma sonra yazdirma islemi yapar

        System.out.println(sayi);








    }
}
