package Days04_Icrement_Concatenation;

public class C03_Concatenation {
    public static void main(String[] args) {

        int a= 10;

        int b = 20;

        String str1= "";
        String str2= " ";
        String str3= "_";

        System.out.println(a+b);//30

        System.out.println(str1+a+b);// ""+10+20== "10"+20 =="1020"==1020

        System.out.println(a+str2+b);//10 + " " + 20 == "10 "+20 == " 10 20 " == 10 20

        System.out.println(a+b+str3);// 10 + 20 + "_"== 30+"-" == "30-"

        System.out.println(str1+a*b); // "" + 10*20 == "" + 200 == "200"

        //System.out.println(str1*a);// + disinda hicbir islem String'le kullanilamaz


        String s1= "Java";
        String s2= " ";
        String s3= "kolay";
        String s4= "";

        int aa=3;
        int bb=4;

        System.out.println(aa*bb+s2+s1+s2+s3);
        System.out.println((aa+bb)+s2+s1+s2+s3);
        System.out.println(s4+aa+bb+s1+s2+s3);
        System.out.println(s1+(aa*bb)+s3);
        System.out.println(s1+aa+bb+s3);
        System.out.println(s1+(aa+bb)+s3);







    }
}
