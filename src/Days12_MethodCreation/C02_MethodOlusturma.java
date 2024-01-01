package Days12_MethodCreation;

public class C02_MethodOlusturma {
    public static void main(String[] args) {

        // verilen 2 sayiyi carpip sonucunu yazdiran bir method olusturun
        // main method da bir method oldugu icin olusturacagimiz yeni method main method parantezinin dısında olmalı

        // bir method ancak method call yapildiginde calisir
        // method call icin method adi ve parametrelere uygun argument yazilmalidir
        // method call icerisinde yazilan variable veya degerlere argument denir

        carpYazdir(5,8);
        carpYazdir(7.4,8.6);

        //carpYazdir("ali", "veli"); argument ve parametreler uyumlu degelse CTE olur

    }

    public static void carpYazdir(double sayi1, double sayi2){
        System.out.println(sayi1 * sayi2);

    }
}
