package Days05_IfStatements;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {


        /*
        Basit if cumleleri kodun geri kalanindan bagimsizdir
        sadece 1 sarta odaklanir
        o sart true ise if body calisir
        sart false ise if body calismaz (KOD CALİSİR)

        Birden fazla bagimsiz if cumlesi kullanilmissa her cumle birbirinden bagimsiz olacaginden
        bazi degerler icin tum if body'leri calisirken bazi degerler icin hic bir if body'si ÇALİSMAYABİLİR
         */

        /*
        Kullanicidan bir sayi alip
        pozitif ise pozitif sayi,
        100 ile 999 arasinda ise (sinirlar dahil) "pozitif 3 basamakli sayi"
        3 ile bolunebiliyorsa "3'un kati"
        birler basamagi 7 ise "Mukemmel"
        seceneklerinden uygul olanlari yazdirin
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");

        double girilenSayi= scan.nextDouble();

        if (0<girilenSayi){
            System.out.println("pozitif sayidir");
        }

        if (100<=girilenSayi && girilenSayi<=999){
            System.out.println("pozitif 3 basamakli sayi");
        }
        if (girilenSayi%3==0){
            System.out.println("3'un kati olan sayidir");
        }
        if (girilenSayi%10==7){
            System.out.println("Mukemmel");
        }

    }
}
