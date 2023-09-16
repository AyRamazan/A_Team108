package Days10_StringManipulations;

public class C04_ReplaceFirst {
    public static void main(String[] args) {

        String str= "Java heyecandir";

        //eger tum a'lari degil de sadece ilk a'yi degistirmek istersek

        System.out.println(str.replaceFirst("a","A"));

        //ilk harf veya rakami sifir yap

        System.out.println(str.replaceFirst("\\w","*"));








    }
}
