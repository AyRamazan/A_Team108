package Days11_ForLoops;

public class C12_MethodCreation {
    public static void main(String[] args) {

        //5'in faktoryelini hesaplayin

        int input = 5;
        int carpim= 1;

        for (int i = input; i >=1 ; i--) {
            carpim*=i;

        }

        // kodun ilerleyen asamalarinde 7! lazim oldu

        input = 7;
        carpim= 1;

        for (int i = input; i >=1 ; i--) {
            carpim*= i;
        }

        // kodun ilerleyen asamalarinde 3! lazim oldu

        input = 3;
        carpim= 1;

        for (int i = input; i >=1 ; i--) {
            carpim*= i;
        }


        // Yukarıdaki tüm kalabalik islemler yerine daha pratik ve az kodla yapılabilir

        // kodun ilerleyen asamalarinde 5! lazim oldu
        faktoryelyazdir(5);


        // kodun ilerleyen asamalarinde 7! lazim oldu
        faktoryelyazdir(7);


        // kodun ilerleyen asamalarinde 3! lazim oldu
        faktoryelyazdir(3);

    }

    private static void faktoryelyazdir(int i) {

        int carpim=1;

        for (int j = 1; j <=i; j++) {

            carpim*=j;

        }
        System.out.println(i+"!= "+carpim);
    }
}
