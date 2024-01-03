package Days12_MethodCreation;

public class C01_Method {
    public static void main(String[] args) {


        //method'lar bazen cok basit islemleri, bazen de kompleks islemleri yapabilir
        // biz o islemleri nasil yapabiliriz diye dusunmek yerine hazir method'u kullanmayi tercih ederiz
        // bizden sonra kodu inceleyecek kisiler de hazir method isimlerinden ne yapmak istedigimizi kolayca anlayabilirler
        //ayrica kodu her yazdigimizde yapabilecegimz muhtemel hatalardan kurtulmus oluruz

       String str="Java'da yolu yariladik";

       str.isEmpty(); // boolean sonuc dondu ama kullanmadik

        //Method'un dondurdugu sonucu kullanmak isterseniz
        //ya yazdirirsiniz
        System.out.println(str.isBlank());//false


        //ya da donen sonucu ileride kullanacaksak atama yapabiliriz

        String buyukHarfliHali=str.toUpperCase();








    }
}
