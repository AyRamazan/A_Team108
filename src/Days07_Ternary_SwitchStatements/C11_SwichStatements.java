package Days07_Ternary_SwitchStatements;

public class C11_SwichStatements {
    public static void main(String[] args) {

        /*

        Kullanicidan ISTQB kisaltmasindan hangi harfin
        anlamini ogrenmek istedigini alin ve girilen harfin karsiligini yazdirin.
        I: International S: Software T: Testing Q: Qualifications B: Board


         */

        char harf='i';

        switch (harf){
            case 'I':
            case 'i':
                System.out.println("International");
                break;
            case 'S':
            case 's':
                System.out.println("Software");
                break;
            case 'T':
            case 't':
                System.out.println("Testing");
                break;
            case 'Q':
            case 'q':
                System.out.println("Qualifications");
                break;
            case 'B':
            case 'b':
                System.out.println("Board");
                break;
            default:
                System.out.println("gecersiz harf");
        }
    }
}
