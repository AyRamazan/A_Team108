package Days10_StringManipulations;

public class C10_ForLoop {
    public static void main(String[] args) {

       /*
       input olarak verilen sayidan baslayip
       7'ser 7'ser arttirarak inpat olarak verilen bitis sayisina kadar
       -tum sayilari
       -kac adet sayi oldugunu
       -ve bu sayilarin toplamimnin kac oldugunu yazdirin
        */

        int inputBas= 34;
        int inputBit=563;

        int sayac=0;
        int toplam=0;

        for (int i = inputBas; i <=inputBit ; i+=7) {
            System.out.println(i+" ");
            sayac++;
            toplam+=i;

        }

        System.out.println(" ");
        System.out.println("Toplam "+sayac+" adet sayi var \nBu sayilarin toplami "+toplam);

    }
}
