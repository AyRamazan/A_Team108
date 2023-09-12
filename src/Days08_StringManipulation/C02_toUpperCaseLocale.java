package Days08_StringManipulation;

import java.util.Locale;

public class C02_toUpperCaseLocale {
    public static void main(String[] args) {

       String str= "JAVA CANDIR";

        System.out.println(str.toLowerCase()); // java candir

        str= str.toLowerCase(Locale.forLanguageTag("Tr"));
        System.out.println(str); //

        str= "sevgi insani hayata bağlar";

        System.out.println(str.toUpperCase()); //SEVGİ İNSANİ HAYATA BAĞLAR

        str= str. toUpperCase(Locale.forLanguageTag("Tr"));
        System.out.println(str);
    }
}
