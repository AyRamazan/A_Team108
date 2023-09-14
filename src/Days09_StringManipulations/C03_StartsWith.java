package Days09_StringManipulations;

public class C03_StartsWith {
    public static void main(String[] args) {

        String str= "Java mutluluktur";

        System.out.println(str.startsWith("Java"));// true
        System.out.println(str.startsWith("j"));// false

        System.out.println(str.startsWith("Java mutluluktur"));// true

        System.out.println(str.startsWith(""));// true

        System.out.println(str.contains("mutlu"));// true
        System.out.println(str.startsWith("mutlu"));//false

        System.out.println(str.startsWith("mutlu",5));// 5. index ve sonrası mutlu ile başlar mı? //true

        System.out.println(str.startsWith("va",2)); // 2. index ve sonrası va ile mi baslıyor // true






    }
}
