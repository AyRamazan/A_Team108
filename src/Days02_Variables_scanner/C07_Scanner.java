package Days02_Variables_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

        /*

        Kullanicidan ismini, soyisimin ve yasini alip asagidaki formatta yazdirin
        İsminiz: John
        Soyisminiz: Doe
        Yasiniz: 44
        Kaydiniz basariyla tamamlanmistir

         */

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz");
        String girilenİsim= scan.nextLine();
        System.out.println("lütfen Soyİsminizi giriniz");
        String girilenSoyisim= scan.nextLine();
        System.out.println("lütfen yasinizi giriniz");
        int girilenyas= scan.nextInt();

        System.out.println("isminiz: "+girilenİsim+
                           "\nSoyisminiz: "+girilenSoyisim+
                           "\nyasiniz "+girilenyas+
                           "\nkaydiniz basariyla tamamlanmistir");




    }
}
