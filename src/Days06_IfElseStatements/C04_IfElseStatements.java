package Days06_IfElseStatements;

import java.util.Scanner;

public class C04_IfElseStatements {
    public static void main(String[] args) {

        /*

        Kullanicidan bir karakter girmesini isteyin,
        girilen karakterin buyuk harf olup olmadigini yazdirin

         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");

        char girilenKarakter= scan.next().charAt(0);

        if (girilenKarakter>='A' && girilenKarakter<='Z'){
            System.out.println("Girilen karakter buyuk harftir");

        }else {
            System.out.println("girilen karakter kucuk harftir");
        }
    }
}
