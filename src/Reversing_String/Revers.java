package Reversing_String;

public class Revers {

    public static void main(String[] agrs) {
       int a =1234;
       int b=0;
       while(a!=0){
           int x=a%10;
           b=b*10+x;
           a/=10;

       }
        System.out.println(b);
    }
}
