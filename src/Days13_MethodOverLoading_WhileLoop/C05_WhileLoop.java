package Days13_MethodOverLoading_WhileLoop;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {

        // Kullanicicdan toplamak uzere sayi alin
        // girilen sayilarin toplami 500 olur veya gecerse
        // " Bu kadar sayi yeter " deyip toplamini yazdirin

        // bu soruyu illa da for loop ile yapalim desek
        // adim sayisini tahmin edip biraz abartabiliriz

        Scanner scan=new Scanner(System.in);
        int toplam=0;
        int sayi=0;



        for (int i = 1; i <10000 ; i++) {
            System.out.println("toplama uzere tamsayi giriniz");
            sayi=scan.nextInt();

            toplam+=sayi;

            if (toplam>=500){
                System.out.println("Bu kadar sayi yeter. Toplamlari " + toplam+ " oldu");
                break;
            }
        }
    }
}
