package Reversing_Numbers;

import java.util.Scanner;

public class By_using_StringBuffer {
    public static void main(String[] args){
        int x=12345;
        int b=0;
        while(x!=0){
            int m=x%10;
            b=b*10+m;
            x=x/10;

        }
        System.out.println(b);
    }
}
