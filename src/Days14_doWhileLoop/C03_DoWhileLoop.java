package Days14_doWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

        /*
        Verilen baslangic ve bitis karakterleri dahil
        aradaki tum karakterleri yazdirin
         */

        char baslangic='f';
        char bitis='m';

        do {
            System.out.print(baslangic+" ");
            baslangic=(char)(baslangic+1);


        }while (baslangic<=bitis);

    }
}
