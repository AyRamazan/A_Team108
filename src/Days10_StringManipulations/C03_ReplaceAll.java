package Days10_StringManipulations;

public class C03_ReplaceAll {

    public static void main(String[] args) {


        /*
        String str="Ja1va 56Guz,zel-dir";
        //bu metindeki sayilardan kurtulun

        System.out.println(str.replace("1","").replace("5","").replace("6",""));

        System.out.println(str.replaceAll("\\d",""));

        str="Ja1va4 565Guz,z6el-578dir";

         */

        /*
        replace method'u zaten istenen degisikligi verilen özellige uyan tum degerler icin yapar
        eger genellemeyi butun sayilari, butun space'leri, butun ozel karakterleri gibi genisletmek istersek
        replace() yerine replaceAll() kullaniriz.

        Java bu genellemeleri yazabilmemiz icin regex(regular expressions) tanimlamistir

        \\d: butun digit'ler

         */
        /*

        System.out.println(str.replaceAll("\\d",""));

        str=str.replaceAll("\\d","");
        System.out.println(str.replaceAll("\\d",""));

        // ozel karakterlerden de kurtulun
        // space de ozel karakter olduğundan bu durumda space'in yok olmaması icin
        // once space yerine metinde olmayan bir deger atayalim

        System.out.println("====================");

        str=str.replace(" ", "5");

        str=str.replace("\\W", "");

        System.out.println(str.replaceAll("\\W", ""));

        str= str.replace("5"," ");

        System.out.println(str);

        */

        // bu metindeki sayilardan kurtulun

        String str= "Ja1v4a 56G8uz,6el-di24r";
        System.out.println(str.replace("1", "").replace("5","").replace("6",""));

        /*
        Replace method'u zaten istenen degisikligi verilen ozellige uyan tum degerler icin yapar

        eger genellemeyi butun sayilari, butun space'leri , butun ozel karakterler gibi genisletmek istersek
        replace() yerine replaceAll() method'unu kullaniriz

        Java bu genellemeleri yazabilmemiz icin regex (regular expressions) tanimlamistir

        \\d: butun digitler icin
         */

        str="Ja/va,;: ogren,./*dikce guzelle?==00098siyor23;.";


        str=str.replaceAll("\\d","");
        System.out.println(str);

        System.out.println(str.replaceAll("\\d", ""));//Java Guz,zel-dir

        // ozel karakterlerden de kurtulun
        // space de ozel karakter olduğundan, spacenin yok olmaması icin
        // önce space yerine metinde olmayan bir deger atayalim

        str=str.replaceAll(" ","5");

        str=str.replaceAll("\\W","");

        str=str.replaceAll("5"," ");
        System.out.println(str);

        //buradaki karakter sayisini bulalim
        String input3="Ali Can, Merve Star, Mark Tom";

        input3=input3.replaceAll("\\W","");
        System.out.println(input3);
        System.out.println(input3.length());






    }
}
