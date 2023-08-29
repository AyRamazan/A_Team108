package Days07_Ternary_SwitchStatements;

public class C04_Ternary {
    public static void main(String[] args) {

        /*
        Kullanicidan alinan deger
        100'den buyukse sayiyi 2 ile carpin
        100'e esit veya kucukse sayiya 10 ekleyin
         */

        int input=45;

        // if else ile yapalim

        if (input>100){
            input*=2;
        }else {
            input+=10;
        }
        System.out.println("if else ile :" +input);


        /*

        Benim yaptigim

        if (input<=100) System.out.println(input+10);
        else if (input>100) System.out.println(input*2);
        System.out.println(input);

         */


        // Ternary ile yapalim

        input=45;

        input=input>100 ? input*2 : input+10;
        System.out.println("ternary ile : "+input);


        /*

        Verilen input'u inceleyin
        eger 100'den buyukse bunu 5'e bolup, bolum sonucunun tek sayi olup olmadigini kontrol edin,
        eger 100'den buyuk degilse, 10 ile bolumunden kalani bulup, bu kalani 5 arttirin,


        Bu tur kompleks islemleri TERNARY İLE YAPMAYİZ

         */



    }
}
