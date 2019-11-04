package Reversing_Numbers;

import java.util.Scanner;

public class By_Using_StringBuilder_append {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        System.out.println("value has to be enterd:");
        int name_of_the_value = sa.nextInt();
        StringBuffer sb = new StringBuffer();
        sb.append(name_of_the_value);
        StringBuffer value_Rverse = sb.reverse();
        System.out.println("the value Reveresed:" + value_Rverse);
    }
}
