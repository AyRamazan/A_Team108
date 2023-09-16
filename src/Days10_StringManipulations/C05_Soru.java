package Days10_StringManipulations;

import java.util.Scanner;

public class C05_Soru {
    public static void main(String[] args) {

        /*
        Kullanicidan bir cumle alin
        -cumlede ev geciyorsa "home home sweet home" yazdirin
        -cumlede is geciyorsa, "calismak guzeldir"
        -ikisini de iceriyorsa "Hem ev lazim hem is"
        -hicbirini icermiyorsa "cok calisman lazim" yazdirin
         */


        /*
        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir cumle yaziniz");
        String girilenCumle= scan.nextLine();

        if (girilenCumle.contains("ev")){
            System.out.println("home home sweet home");
        } else if (girilenCumle.contains("is")) {
            System.out.println("calismak guzeldir");
        } else if (girilenCumle.contains("ev".contains("is"));{
            System.out.println("Hem ev lazim hem is");
        }else
            System.out.println("cok calisman lazim");
         */

        String str="Evden calisiyoru, sirkete gitmeye gerek yok";

        String calisacakStr=str.toLowerCase();

        if (calisacakStr.contains("ev")&& calisacakStr.contains(" is")) {
            System.out.println("Hem ev lazim hem is");
        } else if (calisacakStr.contains("is")) {
            System.out.println("calismak guzeldir");
        } else if (calisacakStr.contains("ev")) {
            System.out.println("home home sweet home");
        }else
            System.out.println("cok calisman lazim cokkk");
    }
}
