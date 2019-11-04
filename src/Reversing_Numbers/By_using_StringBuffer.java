package Reversing_Numbers;

import java.util.Scanner;

public class By_using_StringBuffer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value:");
        int number_one = scanner.nextInt();
        StringBuffer bf = new StringBuffer(String.valueOf(number_one));
        StringBuffer nin = bf.reverse();
        System.out.println("the value is :" + nin);
    }
}
