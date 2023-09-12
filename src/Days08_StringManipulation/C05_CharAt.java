package Days08_StringManipulation;

public class C05_CharAt {
    public static void main(String[] args) {

        String str= "Java guzeldir"; // 13 tane karakter barindirir

        // Javada index 0'dan baslar
        //J==>0. index ,    r==>12. index
        //Charat (index) ile istedigimiz index'teki char'a ulasabilirsiniz

        //ilk a'yı yazdiralim
        System.out.println(str.charAt(1));

        // sondan ikinci harfi yazdiralim
        System.out.println(str.charAt(13-2));// karakter sayisi -2. indexteki eleman

        // sondan 4. karakteri buyuk harf olarak veriniz
        System.out.println(str.toUpperCase().charAt(13-4));

        //charAt method'u bize char döndürdugu icin toUpperCase() calismaz
        //String methodlarini charAt() ile kullanmak isterseniz charAt()' den önce kullanmalisiniz

        System.out.println(str.charAt(13));// Sınırlarin disinda
        //Eger index olarak karakter sayisi veya daha buyuk bir deger girersek  o index'i bulamayacagi icin hata verir





    }
}
