package Days08_StringManipulation;

public class C07_SubString {
    public static void main(String[] args) {

        String str= "Java ogren, isi kap";
        System.out.println(str.length());// karakter sayisi; 19

        // Metnin tam ortasindaki karakter nedir?
        System.out.println(str.charAt(str.length()/2));//n

        // son karakteri yazdirin
        System.out.println(str.charAt(str.length()-1));//p

        // Bir karakteri degil de verilen String'in icerdigi bir metin parcasini elde etmek istersek

        System.out.println(str.substring(5,9));// ogre
        //substring(bas, bitis) methud'unda baslangic olarak yazilan index dahil (inclusive)
        //bitis olarak yazilan index haric (exclusive)'dir

        System.out.println(str.substring(5,10));// ogren

        //Str'dan "Java" kelimesini yazdiralim

        System.out.println(str.substring(0, 4));//Java

        // Str'dan "kap" yazdiralim

        System.out.println(str.substring(16, 19));// kap
        System.out.println(str.substring(16));// kap
        System.out.println(str.substring(str.length() - 3));// kap

        //substring kullanarak sadece "j" harfini yazdirin

        System.out.println(str.charAt(0));
        System.out.println(str.substring(0,1));

        //substring kullanarak 9. index'deki harfi buyuk olarak yazdirin

        System.out.println(str.toUpperCase().substring(9,10));//N
        System.out.println(str.toUpperCase().charAt(9));//N

        //charAt kullanmak yerine substring kullanmak daha avantajli olabilir
        //Cunku substring kullaninca ifade hala string olduğundan medhod kullanmaya devam edebiliriz

        System.out.println(str.substring(5,5));// hiclik yazdirir, yani hiçbirsey yazdirmaz

        System.out.println("===================");

        //System.out.println(str.substring(4,3));//StringIndexOutOfBoundsException
        //System.out.println(str.substring(25,28));//StringIndexOutOfBoundsException

        System.out.println(str.substring(str.length()));// hiclik yazdiriyor
        System.out.println("===================");

        //System.out.println(str.substring(str.length()+1)); Hata verir

    }
}
