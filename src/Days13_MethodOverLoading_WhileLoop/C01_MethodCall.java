package Days13_MethodOverLoading_WhileLoop;

import Days12_MethodCreation.C07_TerceCevirme;
import Days12_MethodCreation.C09_FibonacciSerisi;

public class C01_MethodCall {
    public static void main(String[] args) {

        // ilk 15 fibonacci sayisi yazdirin

        C09_FibonacciSerisi.FibonaccidenSayiYazdir(15);
        //0 1 1 2 3 5 8 13 21 34 55 89 144 233 377

        // asagida verilen cumleyi tersine cevirin

        String str= "Bir kere yaparim, yan gelir yatarim";
        System.out.println(C07_TerceCevirme.metniTerseCevir(str));

        //verilen cumleyi tersine cevirin
        String tersStr= C07_TerceCevirme.metniTerseCevir(str);
        System.out.println(tersStr);

        //asagida verilen cumlenin palindrome olup olmadigini yazdidin

        str="Java Candir";
        tersStr=C07_TerceCevirme.metniTerseCevir(str);

        if (str.equals(tersStr)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Palindrome degil");
        }

    }
}
