package Days07_Ternary_SwitchStatements;

public class C06_Ternary_Sorular {
    public static void main(String[] args) {

        /*

        Kullanicidan notunu alin 50 veya daha buyukse "Sinifi gectin",
        50'den kucukse "Maalesef kaldin" yazdirin

         */

        int input= 44;

        System.out.println(input>=50 ? "Sinifi gectiniz" : "Maalesef kaldiniz");



        /*
        Kullanicidan bir harf isteyin,
        girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        yoksa girilen harfi yazdirin
         */

        char karakter= 'a';

        System.out.println(karakter>='a' && karakter<='z' ? (char) (karakter-32) : karakter);

        //Kullanicidan bir sayi alin ve mutlak degerini yazdirin

        input=-125;

        // |5| = 5 ,   |-4| = (-1)*(-4) = 4

        System.out.println(input>0 ? input : (-1)*(input));


    }
}
