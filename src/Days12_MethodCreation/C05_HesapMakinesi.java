package Days12_MethodCreation;

import java.util.Scanner;

public class C05_HesapMakinesi {
    public static void main(String[] args) {

        // Kullanicidan 2 sayi ve istedigi islemi alin (+ / * -)
        // bir method olusturup sayilara istenen islemi uygulayip sonucu bize dondurun
        // kullanici islemi yanlis secmisse 0 dondurun

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen iki sayi giriniz");
        double Sayi1= scan.nextDouble();
        double Sayi2= scan.nextDouble();

        System.out.println("Lütfen yapmak istediginiz islemi secin \n + , - , / , * ");
        char islem= scan.next().charAt(0);

        System.out.println(hesapMakinesi(Sayi1, Sayi2, islem));
    }

    public static double hesapMakinesi(double sayi1 , double sayi2, char islem){

        switch (islem) {
            case '+':
                return sayi1+sayi2;
            case '-':
                return sayi1-sayi2;
            case '/':
                return sayi1/sayi2;
            case '*':
                return sayi1*sayi2;
            default:
                return 0;
        }
    }
}

