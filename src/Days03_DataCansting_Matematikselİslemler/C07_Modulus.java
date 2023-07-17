package Days03_DataCansting_Matematikselİslemler;

public class C07_Modulus {
    public static void main(String[] args) {

        //% Modulus: Java da bölme islemi sonucunda kalan sayiyi verir.

        System.out.println(15%4);//3;

        System.out.println(45%4);//1

        /*

        Kullanicinin girdigi deger cift sayi mi?
        Girilen sayi %2 isleminin sonucu 0 ise sonuc cift sayidir.

        Kullanicinin girdigi sayi 7'nin kati mi ?
        girilen sayi % 7 isleminin sonucu 0 ise sayi 7'nin kati olur.

        Kullanicinin girdigi sayinin birler basamagi
        kullanici 3426 girdi

         */

        int girilenSayi=3426;
        int birlerBasamagi=girilenSayi % 10;// 6
        System.out.println("birler basamagi:"+birlerBasamagi);


        girilenSayi= girilenSayi/10;
        System.out.println(girilenSayi);//342


        birlerBasamagi=girilenSayi % 10;// 6
        System.out.println("birler basamagi:"+birlerBasamagi);


        girilenSayi= girilenSayi/10;
        System.out.println(girilenSayi);//34

        birlerBasamagi=girilenSayi % 10;// 6
        System.out.println("birler basamagi:"+birlerBasamagi);


        girilenSayi= girilenSayi/10;
        System.out.println(girilenSayi);//3

    }
}
