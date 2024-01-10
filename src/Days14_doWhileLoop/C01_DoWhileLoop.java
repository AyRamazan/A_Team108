package Days14_doWhileLoop;

import java.util.Scanner;

public class C01_DoWhileLoop {
    public static void main(String[] args) {

        // Kullanicidan istedigi kadar sayi alin
        // kullanici deger olarak 0'a basarsa islemi bitirin

        Scanner scan=new Scanner(System.in);
        int girilenSayi=0;
        int toplam=0;

        while (girilenSayi!=0){
            System.out.println("Lütfen toplamak icin bir tamsayi giriniz");
            girilenSayi=scan.nextInt();

            toplam+=girilenSayi;

        }

        System.out.println("Girilen sayilarin toplami :" +toplam);

        /*
        While loop'un 2 tane negatif yonu vardır
        1- Loop'dan once olusturdugumuz ve loop'da kullanacagimiz variable'lara
        yanlis bir deger verirsek, loop bodysi hic calismayabilir

        2-Loop condition'i loop body'sinden bir kez fazla çalisir
        Bu negatif yonler onu kullanılamaz yapacak buyuklukte degildir
        ancak bu negatifliklerden kurtulmak istersek do-while loop kullanabiliriz

         */
    }
}
