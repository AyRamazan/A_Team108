package Days09_StringManipulations;

public class C02_Contains {
    public static void main(String[] args) {

        String str= "Java ogren, mutlu ol";
        // str mutlu iceriyor mu ?

        System.out.println(str.contains("mutlu"));// true

        //charSequence: char dizisi
        //aradigimiz metnun String olması sart degil

        System.out.println(str.contains("j"));//false

        System.out.println(str.contains(" "));// true

        //contains method'u kaç tane olduguna degil
        // sadece var olup olmadigina bakar

        System.out.println(str.contains("Ja") && str.contains("mutlu"));


    }
}
