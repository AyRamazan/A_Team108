package Days11_ForLoops;

import java.util.Scanner;

public class C06_ForLoop {
    public static void main(String[] args) {

        /*
        Soru - 8 ; (Interview)
        Kullanicidan pozitif bir sayi alin 1'den baslayarak tum sayilari yazdirin,
        Sira 3 ile bolunebilen bir sayiya gelirse sayi yerine fizz
        5 ile bolunebilen bir sayiya gelirse yayi yerine buzz
        hem 3 ile hem de 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz yazdirin

         */


        int input= 153;

        for (int i = 1; i <input ; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("fizz ");
            } else if (i % 5 == 0) {
                System.out.println("buzz ");
            } else System.out.print(i+" ");
        }







        /*

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen baslangic icin bir sayi giriniz -----------");
        int Baslangic= scan.nextInt();

        System.out.println("Lutfen bitis icin bir sayi giriniz -----------");
        int Bitis= scan.nextInt();

        int Toplam= 0;

        if (Bitis<Baslangic){
            for (int i = Bitis; i <=Baslangic ; i--) {
                Toplam-=i;
                System.out.println(i+" ");
            }
        } else {
            for (int i = Baslangic; i <=Bitis; i++) {
                Toplam+=i;

            }
            System.out.println("Sayilarin toplami "+ Toplam);
        }


         */

    }
}
