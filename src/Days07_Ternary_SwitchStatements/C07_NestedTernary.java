package Days07_Ternary_SwitchStatements;

public class C07_NestedTernary {

    public static void main(String[] args) {

        /*

        Kullanicidan bir tamsayi alin,
        sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirin,
        sayi pozitif degilse 3 basamakli veya 3 basamakli degil seceneklerinden uygun olani yazdirin

         */

        int sayi= 23;

        //System.out.println(sayi>0 ? "sayi pozitif" : "sayi pozitif degil");


        System.out.println(sayi>0 && (sayi%2==0) ? "sayi pozitif" : "sayi pozitif degil");

        System.out.println(sayi<0 );

    }
}
