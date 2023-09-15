package Days09_StringManipulations;

public class C08_LastIndexOf {
    public static void main(String[] args) {

        String str= "Javayi iyi ogrenmek icin cok calismam lazim cok.";

        System.out.println(str.indexOf("a"));//1
        System.out.println(str.lastIndexOf("a"));//39

        System.out.println(str.lastIndexOf("a", 15));


        System.out.println("=================================");


        // verilen str'da cok kelimesinin kullanimini kontrol edip
        // - cok kelimesi kullanilmamis
        // - bir kere kullanilmis
        // - birden fazla kullanilmis
        // sonuclarindan uygun olani yazdirin
        // Javayi iyi ogrenmek icin cok calismam lazim cok.


        int ilkCokIndex= str.indexOf("cok");
        int sonCokIndex= str.lastIndexOf("cok");


        if (!str.contains("cok")){
            System.out.println("cok kelimesi kullanilmamis");
        } else if (ilkCokIndex==sonCokIndex) {
            System.out.println("cok kelimesi bir kere kullanilmis");
        }else {
            System.out.println("cok kelimesi birden fazla kullanilmis");
        }
    }
}
