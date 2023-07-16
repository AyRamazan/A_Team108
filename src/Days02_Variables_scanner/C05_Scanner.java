package Days02_Variables_scanner;

import java.util.Locale;
import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {

        // Kullanicidan ismini alin ve girilen ismi buyuk harflerle yazdirin

        // Kullanicidan deger almak icin 3 islem yapmamiz gerekir
        // 1. adim scanner objesi olusturmak

        Scanner scan= new Scanner(System.in);

        //2. adim kullaniciya ne istediginizi söyleyin

        System.out.println("lütfen isminizi yaziniz");

        // 3. adim kullanicinin gireceği degeri kaydedeceginiz bir variable olusturun
        // scan objesi ile ilgili method'u kullanarak kullanicinin girdigi degeri olusturduğunuz variable'ye atayin

        String girilenIsim=scan.nextLine();

        // artik kullanicinin girdigi deger girilenIsim variable'sinde kayitli

        System.out.println(girilenIsim.toUpperCase());





    }
}
