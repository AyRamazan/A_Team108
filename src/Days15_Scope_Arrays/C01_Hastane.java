package Days15_Scope_Arrays;

import Days14_doWhileLoop.Hastane;

public class C01_Hastane {

    static  String hastaneIsmi="Yildiz Hastanesi";
    static String hastaneAdresi="Cankaya/Ankara";

    String personelIsmi;
    String personelAdresi;
    String personelTel;


    public static void main(String[] args) {

        /*
        Eger tum medhod'lardan kullanilabilecek variable'lar olusturmak isterseniz
        bu variable'lari class level'da olustururuz

        Class level'da olusturulacak variable'lar icin 2 ihtimal vardır
        1-static variable(Class variable)
        2-intence(static olmayan) variable(obje variable)

        Kural1- Static variable'ler tum objeler icin tek bir deger alir
                Instance variable'ler her bir obje icin java tarafından cogaltılır


        Kural2- Clas level variable'lara deger atamasak da kullanabiliriz
                Biz deger atamasak bile java class level variabla'lara default degerler atar
                non-primitive==> null(String)
                sayisal-primitive==> 0
                char ==> hiclik ''
                boolean==> false

        Kural3- Static olan method'lardan static olmayan variable ve method'lara direk ulasilmaz
                instance variable ve static olmayan method'lari static alanlarda kullanmak isterseniz
                obje uzerinden kullanabilirisiniz

        Kural4- Class'da olusturulan instance variable'lar ilk deger atamasini yapar
                yani bir obje ilk olusturuldugunda otomatik olarak instance variable'a atanan degeri alir
                deger atanmamissta default degerleri alir
                obje olusturulduktan sonra obje uzerinden yapilan atamalar
                class level'daki instance variable'a degil , dava tarafından olusturulup
                objeye yapistirilan kopya variable'a yapilir

        Kural5- Static variable'lar tum objeler için ortaktır
                Static variable'lere tum class'dan direk ulasilabilir
                Static variable'nin degeri degisirse tum objeler icin degismis olur

         */


        C01_Hastane per1=new C01_Hastane();

        System.out.println(per1.personelIsmi);//null
        System.out.println(per1.personelAdresi);//null
        System.out.println(per1.personelTel);//null

        //System.out.println(personelIsmi);

        per1.personelIsmi="Fidan";
        per1.personelAdresi="Germany";
        per1.personelTel="+49556568986";

        C01_Hastane per2= new C01_Hastane();
        System.out.println(per2.personelIsmi);

        per1.personelIsmi="Yusuf";
        System.out.println(per2.personelIsmi);//null
        per2.personelIsmi="Ayten";
        System.out.println(per2.personelIsmi);
        System.out.println(per1.personelIsmi);


        System.out.println(hastaneIsmi);//Yildiz Hastanesi

        System.out.println(per1.hastaneIsmi);//Yildiz Hastanesi
        per2.hastaneIsmi="Java Hastanesi";

        System.out.println(hastaneIsmi); //Java Hastanesi
        System.out.println(per1.hastaneIsmi); //Java Hastanesi
        System.out.println(per2.hastaneIsmi); //Java Hastanesi



    }
    public static void method1(){
        System.out.println(hastaneAdresi);
    }

    public void method(){
        System.out.println(hastaneIsmi);
    }

}

