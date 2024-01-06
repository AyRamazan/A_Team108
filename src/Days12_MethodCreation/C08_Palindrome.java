package Days12_MethodCreation;

public class C08_Palindrome {
    public static void main(String[] args) {

        // Verilen bir String'in palindtrome olup olmadigini yazdirin
        // Palindrome: duz okunusu ile tersten okunusu birbirine ayni olan

        //String str="Bu methodlar ne guzelmis";
        String str= "ey edip adanada pide ye";

        String tersStr= C07_TerceCevirme.metniTerseCevir(str);

        if (str.equals(tersStr)){
            System.out.println("Verilen metin Palindrome");
        }else {
            System.out.println("Verilen metin Palindrome degil");
        }
    }
}
