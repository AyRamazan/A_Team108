package Days11_ForLoops;

import java.util.Scanner;

public class C01_ForLoop {
    public static void main(String[] args) {

        /*
        Kullanicidan bir char alip
        o karakterden sonra gelen 10 karakteri yazdirin
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char girilenKarakter=scan.next().charAt(0);

        for (int i = 1; i <=10 ; i++) {
            System.out.print((char)(girilenKarakter+i) + " ");

        }
    }
}
