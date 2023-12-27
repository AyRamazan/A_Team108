package Days11_ForLoops;

public class C09_NestedLoop {
    public static void main(String[] args) {

        //input olarak verilen kenar uzunluklarına göre
        // asagidaki sekli cizin

        int kısaKenar = 6;
        int uzunKenar = 9;

        /*

             * * * * * * * * // bir satiri nasil yazdiracagimizi inner loop ile belirliyoruz
             * * * * * * * *
             * * * * * * * *
             * * * * * * * *

             Satirda yaptigimiz islemi kac kere tekrar edeceğimizi ise outer loop belirliyor

         */

        for (int i = 1; i <= kısaKenar; i++) {

            for (int j = 1; j <= uzunKenar; j++) {
                System.out.print("* ");

            }
            System.out.println("");//satir ile islemimiz bittiginde alt satira gecmesi icin

        }

    }

}
