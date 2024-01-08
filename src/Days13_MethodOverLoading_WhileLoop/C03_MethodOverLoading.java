package Days13_MethodOverLoading_WhileLoop;

public class C03_MethodOverLoading {
    public static void main(String[] args) {

        toplama(5.4,6.3);//11.7

        toplama('a','b');
        // ilk olarak %100 uyumlu parametreleri arar
        // %100 uyumlu yoksa calisabilecek method var mi diye kontrol eder
        // calisacak method birden fazla olursa, minimum casting yaparak kullanabilecegini tercih eder

        toplama(8.4,6);//14.4

    }

    public static void toplama(int sayi2, double sayi1){
        System.out.println("int ve double sayilarin toplami : "+(sayi1+sayi2));
    }
    public static void toplama(double sayi1, double sayi2){
        System.out.println("2 double sayi toplami : "+(sayi1+sayi2));
    }

}
