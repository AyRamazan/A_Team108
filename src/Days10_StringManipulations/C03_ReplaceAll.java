package Days10_StringManipulations;

public class C03_ReplaceAll {

    public static void main(String[] args) {


        String str="Ja1va 56Guz,zel-dir";
        //bu metindeki sayilardan kurtulun

        System.out.println(str.replace("1","").replace("5","").replace("6",""));

        System.out.println(str.replaceAll("\\d",""));

        str="Ja1va4 565Guz,z6el-578dir";

        /*
        replace method'u zaten istenen degisikligi verilen özellige uyan tum degerler icin yapar
        eger genellemeyi butun sayilari, butun space'leri, butun ozel karakterleri gibi genisletmek istersek
        replace() yerine replaceAll() kullaniriz.

        Java bu genellemeleri yazabilmemiz icin regex(regular expressions) tanimlamistir

        \\d: butun digit'ler

         */

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

    }
}
