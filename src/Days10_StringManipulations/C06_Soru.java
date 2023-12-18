package Days10_StringManipulations;

public class C06_Soru {
    public static void main(String[] args) {

        /*
        Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
        duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
        basariyla kaydedildi" yazdirin
        - ilk harf kucuk harf olmali
        - son karakter rakam olmali
        - sifre bosluk icermemeli
        - uzunlugu en az 10 karakter olmali
         */

        //String sifre= "abc555551453";

        /*
        Bu soruda sartlari bagimsiz if cumlesi ile yapmak veya if-else ile yapmak mumkundur
        == ikisinin de artı ve eksileri var

        -Eger if-else ile yaparsak ilk hatada hatayi yazdirir geriye kalanlara bakmaz// bu dezavantajı
        -Eger hata yoksa otomatik olarak basarili sekilde olusturuldu diyebilir// bu avantajı

        bagimsiz if cumlelerinde tum hatalari bir kerede söyleyebiliriz cünku birbirinden bagimsiz calisirlar;
        ancak bagimsiz if cumleleri kodun geriye kalanı ile ilgilenmediğinden ,
        basarili sifre olusturuldugunu bizim ayri bir mekanizma ile kontrol etmemiz gerekir

         */

        /*
        Sonucta basarili sifre olusturuldu demek icin bir kontrol mekanizması olusturmamiz gerekir
        ya her adimda arttiracagimiz bir sayac yapip en son 4 oldu ise basarili deriz
        veya basta verdiğimiz deger olumsuz bir durum oldugunda arttirilir,
        en sonda kontrol edip eger bastaki degeri hala koruyorsa basarili olmustur, diyebiliriz
         */




        /*

        //- ilk harf kucuk harf olmali
        int flag=0;
        if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')) { // ilk harf kucuk degilse hatayi yazdir
            //sifre.charAt(0)<'a' || sifre.charAt(0)>'z'
            System.out.println("ilk harf kucuk harf olmali");
            flag++;//bir ceza puani aldi
        }

        //- son karakter rakam olmali
        if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9')) {
            //son karakter rakam degilse rapor yazdir
            System.out.println("Son karakter rakam olmali");
            flag++;
        }

        // - sifre bosluk icermemeli
        if (sifre.contains(" ")) {
            System.out.println("sifre bosluk icermemeli");
            flag++;
        }

        // - uzunlugu en az 10 karakter olmali
        if (!(sifre.length()>10)) {
            System.out.println("uzunlugu en az 10 karakter olmali");
            flag++;
        }

        System.out.println(flag);

        if (flag==0){
            System.out.println("sifreniz basariyla kaydedildi");
        }

         */

        String sifre= "abc555551453";
        /*

        - ilk harf kucuk harf olmali
        - son karakter rakam olmali - sifre bosluk icermemeli
        - uzunlugu en az 10 karakter olmali

         */

        int flag=0;


        if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')){
            System.out.println("ilk harf kucuk olmalı");
            flag++;
        }
        if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9')) {
            System.out.println("Son karakter rakam olmalı");
            flag++;
        }

        if (sifre.contains(" ")){
            System.out.println("sifre bosluk icermemeli");
            flag++;
        }
        if (!(sifre.length()>=10)){
            System.out.println("sifrenin uzunlugu en az 10 karakter olmalı");
            flag++;
        }
        if (flag==0){
            System.out.println("sifre basariyla kaydedildi");
        }
    }
}
