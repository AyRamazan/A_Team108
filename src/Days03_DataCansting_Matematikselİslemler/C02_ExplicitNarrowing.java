package Days03_DataCansting_Matematikselİslemler;

public class C02_ExplicitNarrowing {
    public static void main(String[] args) {


        /*

        Eger genis kapasiteli bir data turunden dar kapasiteli bir data turune casting yapmak isterseniz
        java bunu otomatik olarak gerceklestirmez , sizden sorumluluk almanizi ister
        İslemin gerceklesmesi icin cast yapmak istediginiz degerin onunde
        (donusturmek istedigimiz data turu) yazilmalidir

        Explicit narrowing yapildiginde data kayiplari
        veya datanin beklenmedik bir sonuca donusmesi mumkundur

         */


        double dbl= 23.5;

        int sayi= (int)dbl;
        System.out.println(sayi);//23

        byte byt= (byte) sayi;

        System.out.println(byt);

        sayi= 130;
        byt=(byte)sayi;// int daha kapsamlı olduğu icin otomatik olarak atama yapmaz bizden mudahale ister

        System.out.println(byt);



        sayi= 130;
        byt=(byte)sayi;// int daha kapsamlı olduğu icin otomatik olarak atama yapmaz bizden mudahale ister

        System.out.println("int 130'un byte hali:"+byt);// -126


        sayi= 255;
        byt=(byte)sayi;// int daha kapsamlı olduğu icin otomatik olarak atama yapmaz bizden mudahale ister

        System.out.println("int 255'un byte hali:"+byt);// -126

        sayi= 13000;
        byt=(byte)sayi;// int daha kapsamlı olduğu icin otomatik olarak atama yapmaz bizden mudahale ister

        System.out.println("int 13000'un byte hali:"+byt);// -126


    }
}


