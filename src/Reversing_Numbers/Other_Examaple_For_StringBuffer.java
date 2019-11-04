package Reversing_Numbers;

import java.util.Scanner;

public class Other_Examaple_For_StringBuffer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" the value is :");
        int number = scan.nextInt();
        StringBuffer stringBuffer = new StringBuffer(String.valueOf(number));
        StringBuffer reverse = stringBuffer.reverse();
        System.out.println("the reverse value is :" + reverse);

    }
}
