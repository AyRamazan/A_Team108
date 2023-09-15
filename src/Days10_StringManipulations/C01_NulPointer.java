package Days10_StringManipulations;

public class C01_NulPointer {

    public static void main(String[] args) {

        String str1= "";
        String str2= "    ";
        String str3;
        String str4= null;

        System.out.println(str1.length());//0
        System.out.println(str2.length());//4

        System.out.println(str1.isEmpty());// true
        System.out.println(str2.isEmpty());// false

        System.out.println(str1.isBlank());// true
        System.out.println(str2.isBlank());// true

        // null bir deger degil isaretcidir (null pointer)
        // null pointer: non primitive bir objenin olusturuldugunu ancak bilincli olarak deger atanmadigini isaretler
        // null pointer butun non primitiveler icin kullanilabilir
        // str4'un degeri Null'dur cumlesi kesinlikle YANLİSTİR
        // str4'un degeri Null olarak isaretlenmistir cumlesi DOĞRUDUR

        //System.out.println(str3.length());
        //System.out.println(str3.concat("Ali Can"));
        //System.out.println(str3.substring(3, 4));

        /*

        java bir variable'yi olusturup bir deger atanmamasine izin verir
        bir variable'i deger atamadan OLUSTURABİLİRSİNİZ ANCAK KULLANAMAZSANIZ
        deger atanmayan bir variable'i kullanmaya kalkarsaniz java CTE verir

        null pointer ise bu variable'i deger atanmadigini ve bunu bilincli bir tercih olduğunu java'ya söyler
        Dolayisiyla java kodlarin calismaya devam etmesine izin verir.
        Ancak deger atanmadigi icin method'larla kullanmaya calisirsaniz NullPointerException verir

         */

        str4=null;
        //System.out.println(str4.length());//NullPointerException
        //System.out.println(str4.substring(3,4));//NullPointerException


        System.out.println(str4);// null
        System.out.println(str4+ "Ali Can");//nullAli Can
        System.out.println(str4.concat("Ali Can"));











    }
}
