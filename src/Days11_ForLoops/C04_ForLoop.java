package Days11_ForLoops;

public class C04_ForLoop {
    public static void main(String[] args) {

        // eger sart i'nin hiçbir degeri icin true olmuyorsa
        // loop calisir ama loop body'si devreye hic girmediginden islem yapilmaz


        // input olarak verilen sayidan 1'e kadar tum sayilari yazdirin

        int input= 23; // eger kullanicinin pozitif ve negati girebilecegini ongorup ona göre kod yazmazsak
                       // loop body'sinin hic calismamasi durumu olabilir

        /*

        if (input>1){
            for (int i = input; i >1 ; i--) {
                System.out.print(i+" ");
            }

        }
        else {
            for (int i = input; i <=1 ; i++) {
                System.out.print(i+" ");

            }
        }
        */

        if (input>1){
            for (int i = input; i>=1 ; --i) {
                System.out.print(i+ " ");
            }
        }
        else {
            for (int i = input; i<=1 ; i++) {
                System.out.print(i + " ");

            }
        }

        // eger sart i'nin tum degerleri icin dogru oluyorsa teknik olarak sonsuz loop olusur deriz
        //Bilgisayarimiz sonsuza kadar calismaz, ram dolar ve int'in sinirina ulasilir ama teknik olarak bu duruma sonsuz loop denir

        // Input orak verilen sayidan 100'e kadar tum tamsayilari yazdirin

        for (int i = 1; i >0 ; i++) { //
            System.out.print(i+ " ");

        }
    }
}
