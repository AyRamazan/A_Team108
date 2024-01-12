package Days15_Scope_Arrays;

public class C02_Hastane {

    static  String hastaneIsmi="Yildiz Hastanesi";
    static String hastaneAdresi="Cankaya/Ankara";

    String personelIsmi="Personel";
    String personelAdresi="Adres";
    String personelTel="Telefon";


    public static void main(String[] args) {

        C02_Hastane per1=new C02_Hastane();

        C02_Hastane per2=new C02_Hastane();

        per1.personelIsmi="Harun";

        per2.personelAdresi="Cankaya";

        per1.hastaneIsmi="Java Hastanesi";










    }
}
