package Days11_ForLoops;

public class C03_AsalSayi {
    public static void main(String[] args) {

        /*
        input olarak verilen bir tamsayinin
        asal sayi olup olmadigini yazdirin

         */


        int input=4237;
        String sonuc="Sayi asal";

        for (int i = 2; i <input ; i++) {

            if (input%i==0){

               sonuc="Sayi asal degil";
               break;
                // Java bir loop'un icerisinde "break" gorurse
                // o loopu bitirir

            }
        }
        System.out.println(sonuc);

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");

        System.out.println("hello");
    }
}