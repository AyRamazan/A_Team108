package Days13_MethodOverLoading_WhileLoop;

import java.util.Random;
import java.util.Scanner;

public class C07_BasitOyun {
    public static void main(String[] args) {

        /*
        Random olarak 1 ile 100 arasında bir sayi olusturun
        Kullanicidan bu sayiyi bilmesini isteyin
        Kullanici her deger girdiginde
        tuttugumuz sayi ile karsilastirip tahminini buyult/kucult diyelim
        kullanici tuttugumuz sayiyi bildiginde tahmin sayisini ve

        3 veya daha az tahminde bildiyse "Vaawwww"
        4-8 tahminde bildiyse "Aferin"
        daha fazla tahminde bildiyse "basarisiz" yazdirin
         */

        Random rnd=new Random();
        int tutulanSayi= rnd.nextInt(100);
        int sayac=1;
        int tahmin=0;

        Scanner scan= new Scanner(System.in);

        while (tutulanSayi!=tahmin){

            System.out.println("Lütfen bir tahmin giriniz");
            tahmin=scan.nextInt();

            if (tutulanSayi==tahmin){// sayiyi bulduysa
                System.out.println(sayac+ " tahmin ile tuttugum sayiyi buldun");
                if (sayac<=3){
                    System.out.println("Vaowwww");
                } else if (sayac<=8) {
                    System.out.println("Aferin");
                }else{
                    System.out.println("Basarisiz");
                }
                break;
            } else if (tahmin<tutulanSayi) {
                System.out.println("Sayiyi büyült");
                sayac++;
            }else{
                System.out.println("Sayiyi kucult");
                sayac++;
            }
        }
    }
}
