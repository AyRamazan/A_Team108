package Days07_Ternary_SwitchStatements;

public class C10_SwichStatements {
    public static void main(String[] args) {

        /*

        Kullanicidan gun numarasini alin,
        haftaici veya haftasonu oldugunu yazdirin

         */



        int gunNo=3;

        switch (gunNo) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("haftaici");
                break;
            case 6:
            case 7:
                System.out.println("haftasonu");
                break;
            default:
                System.out.println("yanlış gün bilgisi");

        }
    }
}
