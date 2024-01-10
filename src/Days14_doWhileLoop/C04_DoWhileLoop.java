package Days14_doWhileLoop;

public class C04_DoWhileLoop {
    public static void main(String[] args) {

        /*
        Kullanicidan bir pozitif sayi isteyin
        sayinin tam kare olup olmadigini bulunuz
        tamkare ise true degilse false yazdiriniz
        Ornek: input:16 output:4
         */

        int input =36;
        int karekoku=1;
        boolean sonuc= false;

        while (karekoku*karekoku<=input){

            if (karekoku*karekoku==input){
                System.out.println("Girilen sayinin karekoku :"+karekoku);
                sonuc=true;
                break;
            }else {
                karekoku++;

            }
        }
        System.out.println(sonuc);


        //do while loop ile yapalim
        input=144;
        karekoku=1;
        sonuc=false;

        do {

            if (karekoku*karekoku==input){
                System.out.println("Girilen sayinin karekoku :"+karekoku);
                sonuc=true;
                break;
            }else {
                karekoku++;
            }

        }while (karekoku*karekoku<input);

        System.out.println(sonuc);
    }
}
