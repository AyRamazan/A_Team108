package Days13_MethodOverLoading_WhileLoop;

public class C02_MethodOverLoading {
    public static void main(String[] args) {

        String str="Java cok guzel";

        System.out.println(str.substring(5));//cok guzel
        System.out.println(str.substring(3, 5));//a

        //Eger sectigimis isimde birden fazla method varsa buna overloading denir
        //ve ayni isimdeki method'lardan hangisinin calisacagine argument/parametre uyumu karar verir

        toplama(5,6);//11
        toplama(5,3,1);//

        /*

        Java ayni class icerisinde ayni isim ve ayni dava turunden parametre sayisi ile 2 method olusturmaniza izin vermez

        1 - Ismini degistirebiliris, ancak bu durumda overloading olmaz
        Overloading ayni isimde ama farklı isleve sahip methodlar olusturmak demektir
        2 - Parametre sayisini degistirebiliriz
        3- Ayni sayida parametre yazip, parametrelerin data turunu degistirebiliriz
           veya farklı data turundeki parametrelerin yerini degistirebiliriz


         */

        toplama(6,6);
        toplama(4.5,5);
        toplama(4.5,6.7);

    }
    public static void toplama(int sayi1, int sayi2){
        System.out.println("2 tamsayinin toplami :"+(sayi1+sayi2));
    }
    public static void toplama(int sayi1, int sayi2, int sayi3){
        System.out.println("3 tam sayinin toplami :"+(sayi1+sayi2+sayi3));

    }
    public static void toplama(double sayi1, int sayi2){
        System.out.println("double ve int toplami : "+(sayi1+sayi2));
    }
    public static void toplama(int sayi2, double sayi1){
        System.out.println("int ve double sayilarin toplami : "+(sayi1+sayi2));
    }
    public static void toplama(double sayi1, double sayi2){
        System.out.println("2 double sayi toplami : "+(sayi1+sayi2));
    }
}
