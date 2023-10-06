package Days11_ForLoops;

public class C03_AsalSayi {
    public static void main(String[] args) {

        /*
        input olarak verilen bir tamsayinin
        asal sayi olup olmadigini yazdirin

         */


        int input=21;

        for (int i = 2; i <input ; i++) {

            if (input%i==0){

               System.out.println(i);
               System.out.println("sayi asal degil");
               break;
                // Java bir loop'un icerisinde "break" gorurse
                // o loopu bitirir


            }
        }
    }
}