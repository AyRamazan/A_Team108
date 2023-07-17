package Days03_DataCansting_Matematikselİslemler;

import javax.imageio.event.IIOWriteProgressListener;

public class C05_WrapperClass {

    public static void main(String[] args) {

        /*
        int primitive oldugundan hazir method'lari yoktur
        string ise non-primitive oldugu icin hazir method'lara sahiptir

        int, char, boolean gibi primitive variable turlerinde hazir medhod kullanmak icin
        java integer, Character, Boolean gibi wrapper class'lar olusturmustur

        Bunlar primitive'ler ile ayni degerleri alabilir ama ekstradan method'lari da vardir

         */

        //Integer sayi2=20;

        /*
        islemlerimizi yaparken bazen String olarak tanimlanmis ancak
        matematiksel icerik barindiran variable'lar ile karsilasabiliriz
        Bu durumda bu tur String variable'lari sayiya cevirmek ihtiyacimiz olabilir

        *****
        Eger sayiya cevirmek istedigimiz metinlerde harf veya sayi
        olmayan baska bir karakter varsa java hata verir
        *****
         */

        String str2="123";
        String str3="354";//123354

        System.out.println(str2+str3);


        int str2Int= Integer.parseInt(str2);//123
        int str3Int= Integer.parseInt(str3);//354

        System.out.println(str2Int+str3Int);


        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        char krk1='$';

        System.out.println(Character.isDigit(krk1));//false
        System.out.println(Character.isLetter(krk1));//false
        System.out.println(Character.isAlphabetic(krk1));//false

        short sayi3=4;
        int sayi5=sayi3;

        //Wrapper class'larda casting olmaz


        short sayi6=45;
        //Integer sayi7=(Integer) sayi6; kabul etmez



    }
}
