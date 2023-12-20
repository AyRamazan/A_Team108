package Days11_ForLoops;

public class C04_ForLoop {
    public static void main(String[] args) {
        // eger sart i'nin her degeri icin true oluyorsa
        // input olarak verilen sayidan 1'e kadar tum sayilari yazdirin

        int input= 23;

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
    }
}
