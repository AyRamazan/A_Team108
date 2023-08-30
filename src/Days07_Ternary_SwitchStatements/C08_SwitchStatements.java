package Days07_Ternary_SwitchStatements;

public class C08_SwitchStatements {
    public static void main(String[] args) {

        /*

        Kullanicidan 2 sayi alin ve kullaniciya istedigi islemi sorun,
        + , - , * , / isaretlerinden hangisini girerse 2 sayi için o islemi girin,
        bu isaretlerden birini girmezse "yanlis islem tercihi" yazdirin

         */


        int sayi1=20;
        int sayi2=10;

        char islem= '+';

        //if else ile yapalim

        if (islem=='+'){
            System.out.println("Sayilarin toplamı :" + (sayi1+sayi2));
        } else if (islem=='-') {
            System.out.println();
            System.out.println("Sayilarin son hali :" + (sayi1-sayi2));
        } else if (islem=='*') {
            System.out.println("Sayilarin carpımı :" + (sayi1*sayi2));
        } else if (islem=='/') {
            System.out.println("sayilarin bolumu :"+ (sayi1/sayi2));
        }else
            System.out.println("yanlis islem tercihi");


    }
}
